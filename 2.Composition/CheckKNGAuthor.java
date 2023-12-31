public class CheckKNGAuthor {
    private String name;
    private String email;

    public CheckKNGAuthor(String name, String email) {
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author[name= " + name + "," + "email= " + email + "]";
    }
}