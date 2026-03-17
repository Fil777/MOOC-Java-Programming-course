
import java.util.ArrayList;
import java.util.HashMap;


public class Main {

    public static void main(String[] args) {
        
        LicensePlate li1 = new LicensePlate("FI", "ABC-123");
        LicensePlate li2 = new LicensePlate("FI", "UXE-465");
        LicensePlate li3 = new LicensePlate("DE", "B WQ-431");
        LicensePlate li4 = new LicensePlate("RU", "C777MX777");
        LicensePlate li5 = new LicensePlate("FI", "REX-777");

        VehicleRegistry ownersRegistry = new VehicleRegistry();
        ownersRegistry.add(li1, "Arto");
        ownersRegistry.add(li2, "Fil");
        ownersRegistry.add(li3, "Jurgen");
        ownersRegistry.add(li4, "Fil");
        ownersRegistry.add(li5, "Arto");

        System.out.println("\nlicense plates:");
        ownersRegistry.printLicensePlates();
        
        System.out.println("\nowners:");
        ownersRegistry.printOwners();
    }
}
