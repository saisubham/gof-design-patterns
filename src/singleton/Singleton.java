package singleton;

public class Singleton {
    private static Singleton object = null;

    private Singleton() {
    }

    public static Singleton getObject() {
        if (object == null) {
            synchronized (Singleton.class) {
                if (object == null) {
                    object = new Singleton();
                }
            }
        }
        return object;
    }
}
