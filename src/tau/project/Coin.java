package tau.project;

import java.util.Random;

public class Coin {
    private String side;
    public static String HEADS = "HEADS";
    public static String TAILS = "TAILS";

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public void flip() {
        if (new Random().nextBoolean()) {
            setSide(HEADS);
        } else {
            setSide(TAILS);
        }
    }
}
