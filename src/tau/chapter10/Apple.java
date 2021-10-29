package tau.chapter10;

public class Apple extends Fruit {
    public Apple() {
        setCalouries(100.2);
    }

    public void removeSeeds() {
        System.out.println("Apple seeds removed");
    }

    @Override
    public void makeJuice() {
        System.out.println("Apple juice is served 🥤");
    }

}
