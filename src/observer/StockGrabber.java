package observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {
    private ArrayList<Observer> observers;
    private double IBMPrice;
    private double AAPLPrice;

    public StockGrabber() {
        observers = new ArrayList<>();
    }

    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        int index = observers.indexOf(o);
        observers.remove(index);
        System.out.println("Observer " + index + " unregistered.");
    }

    @Override
    public void notifyObservers() {
        for (var o : observers)
            o.update(IBMPrice, AAPLPrice);
    }

    public void setIBMPrice(double IBMPrice) {
        this.IBMPrice = IBMPrice;
        notifyObservers();
    }

    public void setAAPLPrice(double AAPLPrice) {
        this.AAPLPrice = AAPLPrice;
        notifyObservers();
    }
}
