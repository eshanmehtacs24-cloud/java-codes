import java.util.Scanner;

class Student {
    String usn, name;
    int[] credits = new int[5];
    int[] marks = new int[5];

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter USN:");
        usn = sc.next();

        System.out.println("Enter Name:");
        name = sc.next();

        System.out.println("Enter credits:");
        for (int i = 0; i < 5; i++)
            credits[i] = sc.nextInt();

        System.out.println("Enter marks:");
        for (int i = 0; i < 5; i++)
            marks[i] = sc.nextInt();
    }

    void display() {
        System.out.println("USN: " + usn);
        System.out.println("Name: " + name);
    }

    double calculateSGPA() {
        int totalCredits = 0;
        int total = 0;

        for (int i = 0; i < 5; i++) {
            total += marks[i] * credits[i];
            totalCredits += credits[i];
        }
        return (double) total / totalCredits;
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.accept();
        s.display();
        System.out.println("SGPA: " + s.calculateSGPA());
    }
}
