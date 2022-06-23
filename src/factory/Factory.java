package factory;

public class Factory {
    public Car makeCar(String name) {
        Car car = null;
        switch (name) {
            case "a" -> car = new SedanCar();
            case "b" -> car = new SUVCar();
        }
        return car;
    }
}
