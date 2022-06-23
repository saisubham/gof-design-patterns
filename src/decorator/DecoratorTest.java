package decorator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecoratorTest {

    @Test
    public void makeCar() {
        Car car = new Engine(new Brake(new BasicCar()));
        assertEquals(car.getPart(), "chassis, brake, engine");
        assertEquals(car.getCost(), 10 + 2 + 5);
    }
}