package lecture02;

public class car {
    int fuel;
    Tire[] tires;
    Engine[] engine;

    car(Tire[] tire,Engine[] engine) {
        this.fuel = 0;
        this.tires = tires;
        this.engine = engine;
    }


    void run() {
        if (fuel >= 1) {
            System.out.println("燃料を1消費して走りました。");
        } else {
            System.out.println("燃料が足りないため走れませんでした。");
        }
    }

    void startEngine(){
        engine[0].start();
    }

}
