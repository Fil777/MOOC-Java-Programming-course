package testpostgresql;

import testpostgresql.Todo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import static testpostgresql.TestPostgreSQL.DBURL;
import static testpostgresql.TestPostgreSQL.PASS;
import static testpostgresql.TestPostgreSQL.USER;

public class TodoDao {

    private Connection connection;
    private String DBURL;
    private String USER;
    private String PASS;

    public TodoDao(String url, String user, String pass) throws SQLException {
        this.DBURL = url;
        this.USER = user;
        this.PASS = pass;
        this.connection = establishConnection();
        createTable();
    }

    public List<Todo> list() throws SQLException {
        List<Todo> todos = new ArrayList<>();
        try (Connection conn = establishConnection(); ResultSet results = conn.prepareStatement("SELECT * FROM Todo").executeQuery()) {
            while (results.next()) {
                todos.add(new Todo(results.getInt("id"), results.getString("name"), results.getString("description"), results.getBoolean("done")));
            }
        }
        return todos;
    }

    public void add(Todo todo) throws SQLException {
        try (Connection conn = establishConnection()) {
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO Todo (name, description, done) VALUES (?, ?, ?)");
            stmt.setString(1, todo.getName());
            stmt.setString(2, todo.getDescription());
            stmt.setBoolean(3, todo.getDone());
            stmt.executeUpdate();
        }
    }

    public void markAsDone(int id) throws SQLException {
        try (Connection conn = establishConnection()) {
            PreparedStatement stmt = conn.prepareStatement("UPDATE Todo SET done = true WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public void remove(int id) throws SQLException {
        try (Connection conn = establishConnection()) {
            PreparedStatement stmt = conn.prepareStatement("DELETE FROM Todo WHERE id = ?");
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    private void createTable() throws SQLException {
        try (Connection conn = establishConnection()) {
            conn.prepareStatement("CREATE TABLE Todo ("
                    + "id bigint GENERATED ALWAYS AS IDENTITY, "
                    + "name varchar(255), "
                    + "description varchar(10000), "
                    + "done boolean)").execute();
        } catch (SQLException t) {
        }
    }

    private Connection establishConnection() throws SQLException {
        if (this.connection == null || !this.connection.isValid(2)) {
            try {
                this.connection = DriverManager.getConnection(DBURL, USER, PASS);
            } catch (SQLException e) {
                e.printStackTrace();
                this.connection = null;
            }
        }
        return this.connection;
    }
}
