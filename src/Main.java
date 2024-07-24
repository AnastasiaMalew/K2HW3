//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final Car[] cars = {
            new Car("car1", 4),
            new Car("car2", 4)
    };
    private static final Bicycle[] bicycles = {
            new Bicycle("bicycle1", 2),
            new Bicycle("bicycle2", 2)
    };
    private static final Truck[] trucks = {
            new Truck("truck1", 6),
            new Truck("truck2", 8)
    };
    public static void main(String[] args) {

        ServiceStation station = new ServiceStation();
                station.check(cars[1]);
                station.check(bicycles[1]);
                station.check(trucks[1]);
                station.check(cars[2]);
                station.check(bicycles[2]);
                station.check(trucks[2]);
    }
}
