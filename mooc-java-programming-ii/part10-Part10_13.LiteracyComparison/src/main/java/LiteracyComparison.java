
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {

    public static void main(String[] args) {
        
        List<Literacy> litList = readLiteracyFile("literacy.csv");
        litList.stream()
                //.filter(l -> l.toString().startsWith("N"))
                .sorted()
                .forEach(l -> System.out.println(l));

    }

    public static List<Literacy> readLiteracyFile(String file) {
        ArrayList literacyList = new ArrayList<>();

        try {
            Files.lines(Paths.get(file))
                    .map(r -> r.split(","))
                    .map(p -> new Literacy(p[0].trim(), p[1].trim(), p[2].trim().split(" ")[0], p[3].trim(), Integer.valueOf(p[4]), Double.valueOf(p[5])))
                    .forEach(m -> literacyList.add(m));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return literacyList;
    }
}
