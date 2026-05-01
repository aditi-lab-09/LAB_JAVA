import java.util.Scanner;

// Abstract class
abstract class AbstractProduct {
    int product_id;

    AbstractProduct(int id) {
        product_id = id;
    }

    abstract void input();
    abstract void display();
}

// Travel Guide Book
class TravelGuide extends AbstractProduct {
    String title;
    String author;
    double price;

    TravelGuide(int id) {
        super(id);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Travel Guide Title: ");
        title = sc.nextLine();
        System.out.print("Enter Author: ");
        author = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("\n--- Travel Guide Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// CD Class
class CD extends AbstractProduct {
    String title;
    String artist;
    double price;

    CD(int id) {
        super(id);
    }

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CD Title: ");
        title = sc.nextLine();
        System.out.print("Enter Artist: ");
        artist = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void display() {
        System.out.println("\n--- CD Details ---");
        System.out.println("Product ID: " + product_id);
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Price: " + price);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        AbstractProduct p;

        // Travel Guide
        p = new TravelGuide(101);
        p.input();
        p.display();

        // CD
        p = new CD(202);
        p.input();
        p.display();
    }
}
