class Area {

    // Area of square
    double calculateArea(double side) {
        return side * side;
    }

    // Area of rectangle
    double calculateArea(double length, double breadth) {
        return length * breadth;
    }

    // Area of circle
    double calculateArea(float radius) {
        return Math.PI * radius * radius;
    }
}

// Main class
public class area2 {
    public static void main(String[] args) {

        Area a = new Area();

        System.out.println("Area of Square: " + a.calculateArea(5));
        System.out.println("Area of Rectangle: " + a.calculateArea(5, 10));
        System.out.println("Area of Circle: " + a.calculateArea(3.5f));
    }
}