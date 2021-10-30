package tau.chapter11;

import java.util.Scanner;

public class Customer {
    public static void main(String[] args) {
        Book book = new Book();
        book.setPrice(9.99);
        book.setColor("Brown");
        book.setAuthor("Seun");
        book.setIsbn("174617537571671");
        book.setPages(128);
        book.setName("Practicing Java");

        String output = String.format("The book %s was written by %s. \n It is sold for %f with a color of %s and %d pages. \n To find it on the shelf use ISBN %s.", book.getName(), book.getAuthor(), book.getPrice(), book.getColor(), book.getPages(), book.getIsbn());
        System.out.println(output);

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter y to scan barcode");


        if (scanner.nextLine().equalsIgnoreCase("y")) {
            System.out.println(book.getBarcode());
        }
        scanner.close();


    }
}
