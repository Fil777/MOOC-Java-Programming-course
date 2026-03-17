package application;

import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    public static void main(String[] args) {
        Application.launch(args);
    }

    public static HashMap<String, HashMap<Integer, Double>> fillMap(double initialValue, double interestRate) {
        HashMap<String, HashMap<Integer, Double>> values = new HashMap<>();
        String chart1 = "Savings";
        String chart2 = "Interest";
        values.put(chart1, new HashMap<>());
        values.put(chart2, new HashMap<>());
        values.get(chart1).put(0, 0.0);
        values.get(chart2).put(0, 0.0);
        for (int i = 1; i <= 30; i++) {
            double saving = values.get(chart1).get(i-1);
            values.get(chart1).put(i, (initialValue * 12.0) + saving);
            double interest = (((initialValue * 12.0) + values.get(chart2).get(i-1))) * interestRate / 100.0;
            values.get(chart2).put(i, (initialValue * 12.0) + values.get(chart2).get(i-1) + interest);
        }
        return values;
    }

    public static void prepareChart(
            LineChart<Number, Number> lineChart,
            HashMap<String, HashMap<Integer, Double>> values
    ) {
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
    }

    public static void buildChart(
            LineChart<Number, Number> lineChart,
            double initialValue,
            double interestRate
    ) {
        lineChart.getData().clear();
        prepareChart(lineChart, fillMap(initialValue, interestRate));
    }

    public static String formatValue(Number d, String format) {
        return new DecimalFormat(format).format(d);
    }

    @Override
    public void start(Stage stage) {
 
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("Savings calculator");

        BorderPane layout = new BorderPane();

        Label label11 = new Label("Monthly savings");
        Label label12 = new Label(formatValue(25, " ### "));

        Slider slider1 = new Slider(25.0, 250.0, 25.0);
        slider1.setOrientation(Orientation.HORIZONTAL);
        slider1.setMinorTickCount(3);
        slider1.setMajorTickUnit(25);
        slider1.setShowTickLabels(true);
        slider1.setShowTickMarks(true);

        BorderPane bp1 = new BorderPane();
        bp1.setLeft(label11);
        bp1.setCenter(slider1);
        bp1.setRight(label12);

        Label label21 = new Label("Yearly interest rate");
        Label label22 = new Label(formatValue(0, " #.## "));

        Slider slider2 = new Slider(0.0, 10.0, 0.0);
        slider2.setOrientation(Orientation.HORIZONTAL);
        slider2.setShowTickLabels(true);
        slider2.setShowTickMarks(false);

        slider1.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> changed, Number oldValue, Number newValue) {
                label12.setText(formatValue(newValue, " ### "));
                //label12.setText(" " + (Double.toString(newValue.doubleValue())).format("%.0f", newValue) + " ");
                buildChart(lineChart, newValue.doubleValue(), slider2.getValue());
            }
        });

        slider2.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> changed, Number oldValue, Number newValue) {
                label22.setText(formatValue(newValue, " #.## "));
                buildChart(lineChart, slider1.getValue(), newValue.doubleValue());
            }
        });

        BorderPane bp2 = new BorderPane();
        bp2.setLeft(label21);
        bp2.setCenter(slider2);
        bp2.setRight(label22);

        VBox sliders = new VBox();
        sliders.getChildren().addAll(bp1, bp2);

        layout.setTop(sliders);

        layout.setCenter(lineChart); 

        buildChart(lineChart, slider1.getValue(), slider2.getValue());
        
        // display the line chart
        Scene view = new Scene(layout, 640, 480);
        stage.setScene(view);
        stage.show();

    }
}
