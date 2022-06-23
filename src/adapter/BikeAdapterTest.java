package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BikeAdapterTest {

    @Test
    void move() {
        Bike bike = new Bike();
        BikeAdapter bikeAdapter = new BikeAdapter(bike);

        assertEquals(bike.advance(), bikeAdapter.move());
    }
}
