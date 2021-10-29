package tau.chapter9;

public class Cake {
    protected String flavor;
    protected double Price;

    public Cake(String flavor) {
        setFlavor(flavor);
        setPrice(9.99);
    }

    public String getFlavor() {
        return flavor;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        this.Price = price;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

}
