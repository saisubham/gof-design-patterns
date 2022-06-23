package adapter;

public class BikeAdapter implements Vehicle {
    private Bike bike;

    public BikeAdapter(Bike bike) {
        this.bike = bike;
    }

    @Override
    public String move() {
        return bike.advance();
    }
}
