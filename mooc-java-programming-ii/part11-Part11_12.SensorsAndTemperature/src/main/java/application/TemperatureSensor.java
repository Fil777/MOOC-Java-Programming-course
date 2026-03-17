package application;

import java.util.Random;

/**
 *
 * @author Fil
 */
public class TemperatureSensor implements Sensor {
    private boolean sensorOn;

    public TemperatureSensor() {
        sensorOn = false;
    }

    @Override
    public int read() {
        if (!sensorOn) {
            throw new IllegalStateException();
        }
        return new Random().nextInt(61) - 30;
    }

    @Override
    public boolean isOn() {
        return sensorOn;
    }

    @Override
    public void setOn() {
        sensorOn = true;
    }

    @Override
    public void setOff() {
        sensorOn = false;
    }
}
