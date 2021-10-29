package tau.chapter9;

public class WeddingCake extends Cake {
    protected String tiers;

    public WeddingCake() {
        super("Vanilla");
    }

    public String getTiers() {
        return tiers;
    }

    public void setTiers(String tiers) {
        this.tiers = tiers;
    }

}
