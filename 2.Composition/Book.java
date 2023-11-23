public class Book {
    String name;
    Author author;
    double price;
    int quantity = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public double price() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return quantity;
    }

    public void setQty(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Book[name=" + name + "," + "Author[name=" + author.name + "gender=" + author.gender + "email="
                + author.email + "]," + "price=" + price + "quantity=" + quantity + "]";
    }

}
