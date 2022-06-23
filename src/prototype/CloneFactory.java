package prototype;

public class CloneFactory {
    public Car getCar(Car car) {
        return car.makeCopy();
    }
}
