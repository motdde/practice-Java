package tau.chapter10;

public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }

    public void scratch() {
        System.out.println("Scratching is fun");
    }
}
