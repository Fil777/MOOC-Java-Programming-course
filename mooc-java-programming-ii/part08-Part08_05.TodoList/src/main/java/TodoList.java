
import java.util.ArrayList;

/**
 *
 * @author Fil
 */
public class TodoList {

    private final ArrayList<String> list;

    public TodoList() {
        list = new ArrayList<>();
    }

    public void add(String task) {
        list.add(task);
    }

    public void remove(int index) {
        if (index <= list.size() && index > 0) {
            list.remove(index - 1);
        }
    }
    
    public int size(){
        return list.size();
    }

    public void print() {
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ": " + list.get(i));
        }
    }

}
