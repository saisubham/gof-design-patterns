package observer;

public class GetStock implements Runnable {
    private Subject stockGrabber;
    private int startTime;
    private String stock;

    public GetStock(Subject stockGrabber, int startTime, String stock) {
        this.stockGrabber = stockGrabber;
        this.startTime = startTime;
        this.stock = stock;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            double price = Math.random() * 100;
            if (stock.equals("IBM")) ((StockGrabber) stockGrabber).setIBMPrice(price);
            if (stock.equals("AAPL")) ((StockGrabber) stockGrabber).setAAPLPrice(price);
            System.out.println("> " + stock + ": " + price + "\n");
        }
    }
}
