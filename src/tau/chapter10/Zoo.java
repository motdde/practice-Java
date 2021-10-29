package tau.chapter10;

public class Zoo {
    public static void main(String[] args) {
        Dog brandy = new Dog();
        brandy.fetch();
        brandy.makeSound();
        feed(brandy);

        Animal scooby = new Dog();
        scooby.makeSound();
        feed(scooby);

        scooby = new Cat();
        scooby.makeSound();
        feed(scooby);

        // casting types
        ((Cat) scooby).scratch();
    }

    public static void feed(Animal animal) {
        if (animal instanceof Dog) {
            System.out.println("Here is your dog food");
        }

        if (animal instanceof Cat) {
            System.out.println("Here is your cat food");
        }
    }
}
