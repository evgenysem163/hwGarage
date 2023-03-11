public class Main {
    public static void main(String[] args) {
        Transport car = new Car("Car", 4);
        Transport car2 = new Car("Car2", 4);

        Transport truck = new Truck("Man", 6);
        Transport truck2 = new Truck("Daf", 6);

        Transport bicycle = new Bicycle("bicycle", 2);
        Transport bicycle2 = new Bicycle("bicycle2", 2);

        ServiceStation station = new ServiceStation();
        station.check((Car) car);
        station.check((Car) car2);
        station.check((Bicycle) bicycle);
        station.check((Bicycle) bicycle2);
        station.check((Truck) truck);
        station.check((Truck) truck2);
    }
}
