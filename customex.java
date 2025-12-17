import java.util.Scanner;

class WrongAgeException extends Exception {
    WrongAgeException(String msg) {
        super(msg);
    }
}

class Father {
    int fAge;

    Father(int age) throws WrongAgeException {
        if (age < 0)
            throw new WrongAgeException("Father age cannot be negative");
        fAge = age;
    }
}

class Son extends Father {
    int sAge;

    Son(int fAge, int sAge) throws WrongAgeException {
        super(fAge);
        if (sAge >= fAge)
            throw new WrongAgeException("Son age must be less than Father age");
        this.sAge = sAge;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter father age:");
            int fAge = sc.nextInt();

            System.out.println("Enter son age:");
            int sAge = sc.nextInt();

            Son s = new Son(fAge, sAge);
            System.out.println("Valid ages entered");

        } catch (WrongAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
