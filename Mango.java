// Interface
interface Mango {
    void showTaste();
}

// Winter class
class Winter implements Mango {
    public void showTaste() {
        System.out.println("Winter Mango: Rare and less sweet.");
    }
}

// Summer class
class Summer implements Mango {
    public void showTaste() {
        System.out.println("Summer Mango: Juicy, sweet, and delicious!");
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Mango m;

        // Winter Mango
        m = new Winter();
        m.showTaste();

        // Summer Mango
        m = new Summer();
        m.showTaste();
    }
}