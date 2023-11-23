public class circle {
    private double radius;
    private String name;
    public circle() {
        radius = 1.0;
        name = "red";
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String name) {
        this.name = name;
    }
    public circle(double r) {
        radius = r;
        name = "red";
    }
    public double getRadius() {
        return radius;
    }
    public String getColor() {
        return name;
    }
    public double getArea() {
        return  3.14*radius*radius;
    }
    public double getCircumference() {
        return Math.PI*2*radius;
    }
    public String toString() {
        return "cicle[radius ="+ radius +" color="+ name+ "]";
    }

}
