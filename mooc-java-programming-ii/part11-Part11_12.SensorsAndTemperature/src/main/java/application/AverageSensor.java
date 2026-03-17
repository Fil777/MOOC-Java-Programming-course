package application;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Fil
 */
public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> measures;

    public AverageSensor() {
        sensors = new ArrayList<>();
        measures = new ArrayList<>();
    }

    public void addSensor(Sensor toAdd) {
        sensors.add(toAdd);
    }

    public List<Integer> readings() {
        return measures;
    }

    @Override
    public boolean isOn() {
        if (sensors == null || sensors.size() == 0) {
            return false;
        }
        boolean allOn = true;
        for (Sensor sensor : sensors) {
            if (!sensor.isOn()) {
                allOn = false;
                break;
            }
        }
        return allOn;
    }

    @Override
    public void setOn() {
        sensors.stream().forEach(s -> s.setOn());
    }

    @Override
    public void setOff() {
        sensors.stream().forEach(s -> s.setOff());
    }

    @Override
    public int read() {
        if (!isOn()) {
            throw new IllegalStateException("ERROR");
        }
        // all correct
        //int avg = sensors.stream().map(s -> s.read()).reduce(0, (summ, value) -> summ + value ) / sensors.size();
        int avg = sensors.stream().mapToInt(r -> r.read()).sum() / sensors.size();
        //return (int)(sensors.stream().mapToInt(r -> r.read()).average().getAsDouble());
        measures.add(avg);
        return avg;
    }

}
