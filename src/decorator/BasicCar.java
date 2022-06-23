package decorator;

public class BasicCar implements Car {
    @Override
    public String getPart() {
        return "chassis";
    }

    @Override
    public double getCost() {
        return 10.00;
    }
}
