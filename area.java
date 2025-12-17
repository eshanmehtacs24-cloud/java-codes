import java.util.Scanner;

abstract class Shape {
    int x, y;
    abstract void printArea();
}

class Rectangle extends Shape {
    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {
    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {
    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length and breadth of Rectangle:");
        Rectangle r = new Rectangle();
        r.x = sc.nextInt();
        r.y = sc.nextInt();
        r.printArea();

        System.out.println("Enter base and height of Triangle:");
        Triangle t = new Triangle();
        t.x = sc.nextInt();
        t.y = sc.nextInt();
        t.printArea();

        System.out.println("Enter radius of Circle:");
        Circle c = new Circle();
        c.x = sc.nextInt();
        c.printArea();
    }
}
