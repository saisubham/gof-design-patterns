package factory;

public class SedanCar extends Car {
    public SedanCar() {
        setName("Sedan");
        setSpeed(Math.random() * 100);
    }
}
