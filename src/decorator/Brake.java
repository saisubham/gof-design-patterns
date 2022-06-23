package decorator;

public class Brake extends PartDecorator {
    public Brake(Car car) {
        super(car);
    }

    @Override
    public String getPart() {
        return car.getPart() + ", brake";
    }

    @Override
    public double getCost() {
        return car.getCost() + 2.00;
    }
}
