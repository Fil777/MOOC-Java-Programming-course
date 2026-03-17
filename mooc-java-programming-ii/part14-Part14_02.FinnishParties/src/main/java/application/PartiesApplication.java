package application;

import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    public static void main(String[] args) {
        Application.launch(args);
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
                .map(s -> s.split("\t"))
                .forEach(p -> {
                    values.put(p[0], new HashMap<>());
                    for (int i = 1; i < p.length; i++) {
                        if (!p[i].equals("-")) {
                            values.get(p[0]).put(Integer.valueOf(years[i]), Double.valueOf(p[i]));
                        }
                    }
                });
        return values;
    }
    
    public static LineChart<Number, Number> prepareChart(HashMap<String, HashMap<Integer, Double>> values){
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        // go through the parties and add them to the chart
        values.keySet().stream().forEach(party -> {
            // a different data set for every party
            XYChart.Series data = new XYChart.Series();
            data.setName(party);

            // add the party's support numbers to the data set
            values.get(party).entrySet().stream().forEach(pair -> {
                data.getData().add(new XYChart.Data(pair.getKey(), pair.getValue()));
            });

            // and add the data set to the chart
            lineChart.getData().add(data);
        });
        return lineChart;
        
    }

    @Override
    public void start(Stage stage) {
        String file = "partiesdata.tsv";
        ArrayList<String> input;
        HashMap<String, HashMap<Integer, Double>> values;
        LineChart<Number, Number> lineChart;

        // read file
        input = readFile(file);
        // fill map with data
        values = fillMap((ArrayList<String>) input);

        lineChart = prepareChart(values);
        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();

    }
}
