public class Rectangle {
    float length = 1.0f;
    float width = 2.0f;
    public Rectangle() {

    }
    public Rectangle(float length,float width) {
        this.length = length;
        this.width = width;
    }
    public void setLength(float length) {
        this.length = length;
    }
    public void setWidth(float width){
        this.width = width;
    }
    public float getLength(){
        return length;
    }
    public float getWidth() {
        return width;
    }
    public double getArea() {
        return length*width;
    }
    public double getPerimeter() {
        return 2*(length+width);
    }
    public String toString() {
        return "Recangle[length: "+length+ " width: "+width+ "]";
    }
}


