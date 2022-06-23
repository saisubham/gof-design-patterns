package factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactoryTest {

    @Test
    void makeCar() {
        Factory factory = new Factory();
        Car a = factory.makeCar("a");
        Car b = factory.makeCar("b");

        assertEquals(a.getClass(), SedanCar.class);
        assertEquals(b.getClass(), SUVCar.class);
    }
}