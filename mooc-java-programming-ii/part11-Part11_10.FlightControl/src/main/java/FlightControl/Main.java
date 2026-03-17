package FlightControl;

import flightControl.logic.FlightControl;
import flightControl.ui.TextUI;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        FlightControl flightcontrol = new FlightControl();
        TextUI ui = new TextUI(flightcontrol, scan);

        ui.start();
    }
}
