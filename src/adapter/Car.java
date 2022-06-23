package adapter;

public class Car implements Vehicle {
    @Override
    public String move() {
        return "Car moved.";
    }
}
