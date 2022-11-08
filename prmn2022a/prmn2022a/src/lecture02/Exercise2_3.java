package lecture02;

public class Exercise2_3 {
    public static void main(String[] args) {
        Tire[] tires = new Tire[4];
        tires[0] =new Tire(65);
        Engine[] engines = new Engine[4];
        engines[0] = new Engine(4000);
        car car = new car(tires,engines);
        GasStation Gas = new GasStation();
        Gas.refuel(car);
        car.startEngine();
        car.run();
    }
}
