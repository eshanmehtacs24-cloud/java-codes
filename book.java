import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int num_pages;

    Book(String name, String author, double price, int num_pages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.num_pages = num_pages;
    }

    void setPrice(double price) {
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    public String toString() {
        return "Name: " + name +
               "\nAuthor: " + author +
               "\nPrice: " + price +
               "\nPages: " + num_pages;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of books:");
        int n = sc.nextInt();

        Book[] books = new Book[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter book name, author, price, pages:");
            String name = sc.next();
            String author = sc.next();
            double price = sc.nextDouble();
            int pages = sc.nextInt();

            books[i] = new Book(name, author, price, pages);
        }

        for (int i = 0; i < n; i++) {
            System.out.println("\nBook " + (i + 1));
            System.out.println(books[i]);
        }
    }
}
