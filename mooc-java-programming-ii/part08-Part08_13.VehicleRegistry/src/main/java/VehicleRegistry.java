
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author Fil
 */
public class VehicleRegistry {

    private HashMap<LicensePlate, String> registry;

    public VehicleRegistry() {
        registry = new HashMap<LicensePlate, String>();
    }

    public boolean add(LicensePlate licensePlate, String owner) {
        String previousOwner = registry.put(licensePlate, owner);
        return (previousOwner == null || previousOwner.isEmpty());
    }

    public String get(LicensePlate licensePlate) {
        return registry.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        return registry.remove(licensePlate) != null;
    }

    public void printLicensePlates() {
        if (registry.size() == 0) {
            return;
        }
        for (Map.Entry<LicensePlate, String> entry : registry.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
    }

    public void printOwners() {
        if (registry.size() == 0) {
            return;
        }
        HashSet<String> uniqueValues = new HashSet<>();
        for (String value : registry.values()) {
            uniqueValues.add(value);
        }
        for (String value : uniqueValues) {
            System.out.println(value);
        }
    }
    
        public void printOwnersAlt() {
        ArrayList<String> printed = new ArrayList<>();
 
        for (String owner : registry.values()) {
            if (printed.contains(owner)) {
                continue;
            } 
            System.out.println(owner);
            printed.add(owner);
        }
    }
}
