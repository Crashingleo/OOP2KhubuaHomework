public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Велосипед 1");
        Car car = new Car("Машина 1", 4);
        Truck truck = new Truck("Грузовик 1", 6);

        ServiceStation serviceStation = new ServiceStation();
        serviceStation.check(bicycle);

        System.out.println("=============");

        serviceStation.check(car);

        System.out.println("=============");

        serviceStation.check(truck);


    }
}