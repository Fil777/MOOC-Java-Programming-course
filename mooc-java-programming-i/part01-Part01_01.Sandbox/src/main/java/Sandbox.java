
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeSet.add;

public class Sandbox {

    public static void main(String[] args) {

        String file = "C:\\Users\\Fil\\Documents\\NetBeansProjects\\SandBox\\partiesdata.tsv";
        ArrayList<String> input;
        HashMap<String, HashMap<Integer, Double>> values;

        // read file
        input = readFile(file);
        // fill map with data
        values = fillMap((ArrayList<String>) input);

        int stop = 1;
    }

    public static ArrayList readFile(String file) {
        ArrayList<String> list = new ArrayList<>();

        try (Scanner reader = new Scanner(Paths.get(file))) {
            while (reader.hasNextLine()) {
                list.add(reader.nextLine());
            }
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return list;
    }

    public static HashMap fillMap(ArrayList<String> list) {
        HashMap<String, HashMap<Integer, Double>> values
                = new HashMap<String, HashMap<Integer, Double>>();

        String firstString = list.get(0);
        String[] years = firstString.split("\t");

        list.stream()
                .filter(s -> !s.startsWith("Party", 0))
                .forEach(s -> {
                    String[] p = s.split("\t");
                    System.out.println(p[0]);
                    values.put(p[0], new HashMap<>());
                    for (int i = 1; i < p.length; i++) {
                        if (!p[i].equals("-")) {
                            values.get(p[0]).put(Integer.valueOf(years[i]), Double.valueOf(p[i]));
                        }
                    }
                });
        return values;
    }
}
