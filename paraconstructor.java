public class paraconstructor {

    int num;
    paraconstructor(int n) {
        num = n;
        System.out.println("Number is: " + num);
    }

    public static void main(String[] args) {
        paraconstructor obj = new paraconstructor(50);
    }
}
