package singleton;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SingletonTest {

    @Test
    void getObject() {
        ArrayList<Singleton> objects = new ArrayList<>();

        for (int i = 0; i < 10; ++i)
            new Thread(() -> objects.add(Singleton.getObject()));

        for (int i = 0; i < objects.size() - 1; ++i)
            assertNotEquals(objects.get(i), objects.get(i + 1));
    }
}
