package decorator;

public abstract class PartDecorator implements Car {
    protected Car car;

    public PartDecorator(Car car) {
        this.car = car;
    }

    @Override
    public String getPart() {
        return car.getPart();
    }

    @Override
    public double getCost() {
        return car.getCost();
    }
}
