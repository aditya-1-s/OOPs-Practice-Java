public class Employee {
    int id,salary;
    String firstName,lastName;
    Employee(int id,String firstName,String lastName,int salary) {
        this.firstName = firstName;
        this.id = id;
        this.lastName = lastName;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getName() {
        return firstName + lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAnnualSalary() {
       int AnnSal = salary*12;
        return AnnSal;
    }
    public int raiseSalary(int percent) {
        this.salary = this.salary + (this.salary * percent / 100);
        return this.salary;
    }
    public String toString() {
        return "Employee[id = "+id+",name = "+firstName+lastName+", salary = " + salary+"]";
    }
}
