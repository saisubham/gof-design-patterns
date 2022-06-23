package factory;

public class SUVCar extends Car {
    public SUVCar() {
        setName("SUV");
        setSpeed(Math.random() * 100);
    }
}
