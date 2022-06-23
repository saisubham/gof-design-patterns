package decorator;

public class Engine extends PartDecorator {
    public Engine(Car car) {
        super(car);
    }

    @Override
    public String getPart() {
        return car.getPart() + ", engine";
    }

    @Override
    public double getCost() {
        return car.getCost() + 5.00;
    }
}
