public class BookArr {
    String name;
    Author[] authors;
    double price;
    int quantity = 0;

    public BookArr(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public BookArr(String name, Author[] authors, double price, int quantity) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
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

    // public String toString() {
    // return "Book[name=" + name + "," + "Author[name=" + authors.name + "gender="
    // + author.gender + "email="
    // + author.email + "]," + "price=" + price + "quantity=" + quantity + "]";
    // }
    public String getAuthorNames() {
        String authorNames = "";
        for (Author item : authors) {
            authorNames += item.getName() + ",";
        }
        StringBuilder newAuthorNames = new StringBuilder(authorNames);
        newAuthorNames.deleteCharAt(newAuthorNames.length() - 1);
        return newAuthorNames.toString();
    }

    public String toString() {
        String author = "";
        for (Author item : authors) {
            author += item.toString() + ",";
        }
        StringBuilder newAuthors = new StringBuilder(author);
        newAuthors.deleteCharAt(newAuthors.length() - 1);
        return "Book[" + "name= " + name + ",author={" + newAuthors + "},price" + price + ",quanity" + quantity + "]";

    }
}
