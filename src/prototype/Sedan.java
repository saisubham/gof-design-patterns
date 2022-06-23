package prototype;

public class Sedan implements Car {

    public Sedan() {
    }

    @Override
    public Car makeCopy() {
        Sedan sedan = null;

        try {
            sedan = (Sedan) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return sedan;
    }

    @Override
    public String toString() {
        return "Sedan{}";
    }
}
