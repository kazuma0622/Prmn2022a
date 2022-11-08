package lecture02;

public class GasStation {

    void refuel(car car){
        car.fuel = car.fuel + 20;
        System.out.println("給油したことによりfuelが20増えました。");
    }
}
