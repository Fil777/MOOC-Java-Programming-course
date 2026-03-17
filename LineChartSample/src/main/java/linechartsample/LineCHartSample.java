package linechartsample;

import java.util.HashMap;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class LineCHartSample extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage stage) {
        // create the x and y axes that the chart is going to use
        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();

        // set the titles for the axes
        xAxis.setLabel("Year");
        yAxis.setLabel("Relative support (%)");

        // create the line chart. The values of the chart are given as numbers
        // and it uses the axes we created earlier
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support in the years 1968-2008");

        // create container for data
        HashMap<String, HashMap<Integer, Double>> values
                = new HashMap<String, HashMap<Integer, Double>>();

        // put data into container
        values.put("RKP", new HashMap<>());
        values.get("RKP").put(1968, 5.6);
        values.get("RKP").put(1972, 5.2);
        values.get("RKP").put(1976, 4.7);
        values.get("RKP").put(1980, 4.7);
        values.get("RKP").put(1984, 5.1);
        values.get("RKP").put(1988, 5.3);
        values.get("RKP").put(1992, 5.0);
        values.get("RKP").put(1996, 5.4);
        values.get("RKP").put(2000, 5.1);
        values.get("RKP").put(2004, 5.2);
        values.get("RKP").put(2008, 4.7);

        values.put("VIHR", new HashMap<>());
        values.get("VIHR").put(1984, 2.8);
        values.get("VIHR").put(1988, 2.3);
        values.get("VIHR").put(1992, 6.9);
        values.get("VIHR").put(1996, 6.3);
        values.get("VIHR").put(2000, 7.7);
        values.get("VIHR").put(2004, 7.4);
        values.get("VIHR").put(2008, 8.9);

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

        // ranging the X and Y axis
        Integer maxI = Math.max(
                values.get("VIHR").keySet().stream().max(Integer::compare).get(),
                values.get("RKP").keySet().stream().max(Integer::compare).get());
        Integer minI = Math.min(
                values.get("VIHR").keySet().stream().min(Integer::compare).get(),
                values.get("RKP").keySet().stream().min(Integer::compare).get());
        Long totalValues = 
                values.get("VIHR").keySet().stream().count() +
                values.get("RKP").keySet().stream().count() ;
        Long xTickUnit = (maxI - minI) / totalValues;
        
        xAxis.setAutoRanging(false);
        xAxis.setTickUnit(xTickUnit);
        xAxis.setLowerBound(minI - xTickUnit);
        xAxis.setUpperBound(maxI + xTickUnit);

        Double maxD = Math.max(
                values.get("VIHR").values().stream().max(Double::compare).get(),
                values.get("RKP").values().stream().max(Double::compare).get());
        Double minD = Math.min(
                values.get("VIHR").values().stream().min(Double::compare).get(),
                values.get("RKP").values().stream().min(Double::compare).get());
        Double yTickUnit = (maxD - minD) / totalValues;

        
        yAxis.setAutoRanging(false);
        xAxis.setTickUnit(yTickUnit);
        yAxis.setLowerBound(minD - yTickUnit);
        yAxis.setUpperBound(maxD + yTickUnit);

        // display the line chart
        Scene view = new Scene(lineChart, 640, 480);
        stage.setScene(view);
        stage.show();
    }
}
