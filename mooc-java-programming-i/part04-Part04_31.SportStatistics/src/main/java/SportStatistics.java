
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        ArrayList<Game> games = readGamesFromFile(file);

        System.out.println("Team:");
        String team = scan.nextLine();

        int total = 0;
        int wins = 0;
        int losses = 0;
        for (Game game : games) {
            if (game.played(team)) {
                total++;
                if (game.winner(team)) {
                    wins++;
                } else if (game.loser(team)) {
                    losses++;
                }
            }
        }
        System.out.println("Games: " + total);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);
    }

    public static ArrayList<Game> readGamesFromFile(String file) {
        ArrayList<Game> games = new ArrayList<>();
        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                // we print the line that we read
                String[] parts = line.split(",");
                Game game = new Game(parts[0], parts[1], Integer.valueOf(parts[2]), Integer.valueOf(parts[3]));
                games.add(game);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return games;
    }
}
