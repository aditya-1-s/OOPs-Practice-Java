public class Account {
    String  id;
    int balance = 0;
    String name;
    public Account(String id,String name) {
        this.id = id;
        this.name = name;
    }
    public Account(String id,String name,int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        this.balance = amount+this.balance;
        return balance;
    }
    public int debit(int amount) {
        if(amount<=balance) {
            this.balance = this.balance-amount;
        }
        else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }
    public int transferTo(Account another,int amount) {
        if(amount<=balance) {
            another.credit(amount);
            this.balance = this.balance-amount;
        }
        else {
            System.out.println("Amount Excedded Balance");
        }
        return balance;
    }
    public String toString() {
        return "Account[id = "+id+ ", name = "+name + ", balance = "+balance+"]";
    }
}
