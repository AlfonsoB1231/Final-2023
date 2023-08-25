public class Book {
    private String title;
    private double price;
    private int year;
    private String author;

    public Book(String title, double price, int year, String author) {
        this.title = title;
        this.price = price;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        Book book1 = new Book("Superheroes are Real", 15.50, 1719, "Raymond Bahana");
        Book book2 = new Book("Falling in Love with Polymorphism", 12.80, 1902, "Nunung Nurul Qomariyah");
        Book book3 = new Book("Bleh Bleh Bleh Bleh", 9.50, 1996, "Jude Martinez");

        System.out.println("Book 1:");
        System.out.println("Title: " + book1.getTitle());
        System.out.println("Price: $" + book1.getPrice());
        System.out.println("Year: " + book1.getYear());
        System.out.println("Author: " + book1.getAuthor());
        System.out.println();

        System.out.println("Book 2:");
        System.out.println("Title: " + book2.getTitle());
        System.out.println("Price: $" + book2.getPrice());
        System.out.println("Year: " + book2.getYear());
        System.out.println("Author: " + book2.getAuthor());
        System.out.println();

        System.out.println("Book 3:");
        System.out.println("Title: " + book3.getTitle());
        System.out.println("Price: $" + book3.getPrice());
        System.out.println("Year: " + book3.getYear());
        System.out.println("Author: " + book3.getAuthor());
    }
}
