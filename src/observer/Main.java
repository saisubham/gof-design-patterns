package observer;

public class Main {
    public static void main(String[] args) {
        StockGrabber stockGrabber = new StockGrabber();
        StockObserver o1 = new StockObserver(stockGrabber);

        stockGrabber.setAAPLPrice(10);
        stockGrabber.setIBMPrice(20);

        StockObserver o2 = new StockObserver(stockGrabber);

        stockGrabber.setAAPLPrice(30);
        stockGrabber.setIBMPrice(40);

        stockGrabber.unregister(o1);

        stockGrabber.setAAPLPrice(50);
        stockGrabber.setIBMPrice(60);

        Runnable getIBM = new GetStock(stockGrabber, 2, "IBM");
        Runnable getAAPL = new GetStock(stockGrabber, 2, "AAPL");

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
    }
}
