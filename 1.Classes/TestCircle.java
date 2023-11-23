public class TestCircle {
    public static void main(String[] args) {
        circle c1 = new circle();
        // System.out.println("The Circle has a radius of "+ c1.getRadius() + " and has
        // a area " + c1.getArea());
        // circle c2 = new circle(2.0);
        // System.out.println("The circle has a radius of "+ c2.getRadius()+ " and has a
        // area "+ c2.getArea());
        circle c5 = new circle(4.6);
        System.out.println(c5);
        // circle c6 = new circle(6.6);
        // System.out.println(c6.toString()); // explicit call
        // System.out.println(c6); // println() calls toString() implicitly, same as
        // above
        // System.out.println("Operator '+' invokes toString() too: " + c6); // '+'
        // invokes toString() too
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.printf("radius is: " + c1.getRadius());
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
