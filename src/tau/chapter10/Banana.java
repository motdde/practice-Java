package tau.chapter10;

public class Banana extends Fruit {
    public Banana() {
        setCalouries(15.9);
    }

    public void peel() {
        System.out.println("Banana peel removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Banana smothie served");
    }
}
