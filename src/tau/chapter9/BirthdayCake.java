package tau.chapter9;

public class BirthdayCake extends Cake {
    protected String candles;

    public BirthdayCake() {
        super("Spirit");
    }

    public String getCandles() {
        return candles;
    }

    public void setCandles(String candles) {
        this.candles = candles;
    }
}
