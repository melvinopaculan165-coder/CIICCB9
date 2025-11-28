public class Task11 {
    public static void main(String[] args) {
        Book book1 = new Book("Java Programming", "John Smith", 2021, 39.99);
        Book book2 = new Book("Python Basics", "Jane Doe", 2020, 29.99);
        Book book3 = new Book("C++ Essentials", "Michael Johnson", 2018, 41.99);

        System.out.println("Book 1:");
        System.out.println(book1.toString());
        
        System.out.println("\n Book 2:");
        System.out.println(book2.toString());

        System.out.println("\n Book 3:");
        System.out.println(book3.toString());
    }
}

class Book {
    private String title;
    private String author;
    private int year;
    private double price;

    public Book(String title, String author, int year, double price) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Title: " + title + "\n"
             + "Author: " + author + "\n"
             + "Year: " + year + "\n"
             + "Price: " + String.format("%.2f", price);
    }
}