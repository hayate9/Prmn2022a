package lecture02;

public class Kadai2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        Engine engine = new Engine(4000);
        Car car = new Car(tires, engine);
        GasStation gs = new GasStation();
        gs.refuel(car);
        car.startEngine();
        car.run();
    }
}
