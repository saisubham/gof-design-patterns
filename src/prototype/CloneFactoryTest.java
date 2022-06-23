package prototype;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CloneFactoryTest {

    @Test
    void getCar() {
        CloneFactory factory = new CloneFactory();
        Car sedan = new Sedan();
        Car cloneSedan = (Sedan) factory.getCar(sedan);

        assertEquals(sedan.getClass(), cloneSedan.getClass());
        assertNotEquals(sedan.hashCode(), cloneSedan.hashCode());
    }
}
