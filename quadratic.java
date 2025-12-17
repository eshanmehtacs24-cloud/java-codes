import java.util.Scanner;

class quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = b*b - 4*a*c;

        if (d < 0) {
            System.out.println("No real solutions");
        } else if (d == 0) {
            double x = -b / (2*a);
            System.out.println(x);
        } else {
            double x1 = (-b + Math.sqrt(d)) / (2*a);
            double x2 = (-b - Math.sqrt(d)) / (2*a);
            System.out.println(x1);
            System.out.println(x2);
        }
    }
}
