package observer;

public class StockObserver implements Observer {
    private double IBMPrice;
    private double AAPLPrice;

    private static int numObservers = 0;
    private int observerId;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerId = numObservers++;
        stockGrabber.register(this);
        System.out.println("Observer " + observerId + " registered.");
    }

    @Override
    public void update(double IBMPrice, double AAPLPrice) {
        synchronized (this) {
            this.IBMPrice = IBMPrice;
            this.AAPLPrice = AAPLPrice;
            printStockPrices(IBMPrice, AAPLPrice);
        }
    }

    private void printStockPrices(double IBMPrice, double AAPLPrice) {
        System.out.println("Observer: " + observerId);
        System.out.println("IBM:  " + IBMPrice);
        System.out.println("AAPL: " + AAPLPrice);
        System.out.println();
    }
}
