public class CheckKNGBook {
    String name;
    String isbn;
    CheckKNGAuthor author;
    double price;
    int qty = 0;

    public CheckKNGBook(String name, CheckKNGAuthor author, String isbn, double price, int qty) {
        this.name = name;
        this.author = author;
        this.isbn = isbn;
        this.price = price;
        this.qty = qty;

    }

    public CheckKNGBook(String isbn, String name, CheckKNGAuthor author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getName() {
        return name;
    }

    public CheckKNGAuthor getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getAuthorName() {
        return author.getName();
    }

    public String toString() {
        return "Book[isbn=" + isbn + "name= " + name + "Author[" + author.toString() + "]" + "price=" + price + "qty="
                + qty + "]";
    }
}
