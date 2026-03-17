package application;

public class Program {

    public static void main(String[] args) {

//        Sensor kumpula = new TemperatureSensor();
//        kumpula.setOn();
//        System.out.println("temperature in Kumpula " + kumpula.read() + " degrees Celsius");
//
//        Sensor kaisaniemi = new TemperatureSensor();
//        Sensor helsinkiVantaaAirport = new TemperatureSensor();
//
//        AverageSensor helsinkiRegion = new AverageSensor();
//        helsinkiRegion.addSensor(kumpula);
//        helsinkiRegion.addSensor(kaisaniemi);
//        helsinkiRegion.addSensor(helsinkiVantaaAirport);
//
//        helsinkiRegion.setOn();
//        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//        Sensor kumpula = new TemperatureSensor();
//        Sensor kaisaniemi = new TemperatureSensor();
//        Sensor helsinkiVantaaAirport = new TemperatureSensor();
//
//        AverageSensor helsinkiRegion = new AverageSensor();
//        helsinkiRegion.addSensor(kumpula);
//        helsinkiRegion.addSensor(kaisaniemi);
//        helsinkiRegion.addSensor(helsinkiVantaaAirport);
//
//        helsinkiRegion.setOn();
//        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//        System.out.println("temperature in Helsinki region " + helsinkiRegion.read() + " degrees Celsius");
//
//        System.out.println("readings: " + helsinkiRegion.readings());
        AverageSensor ka = new AverageSensor();
        ka.addSensor(new StandardSensor(4));
        ka.read();
        System.out.println("readings: " + ka.readings());
    }

}
