public class Ball {
    float x,y,xDelta,yDelta;
    int radius;
    public Ball(float x,float y,int radius,float xDelta,float yDelta) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.xDelta = xDelta;
        this.yDelta = yDelta;
    }
    public float getX() {
        return x;
    }
    public void setX(float x) {
        this.x = x;
    }
    public float getY() {
        return y;
    }
    public void setY(float y) {
        this.y = y;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
    public float getxDelta() {
        return xDelta;
    }
    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }
    public float getyDelta() {
        return  yDelta;
    }
    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }
    public void move() {
        this.x = this.x+this.xDelta;
        this.y = this.y+this.yDelta;
    }
    public void reflectHorizontal() {
        this.xDelta = -(this.xDelta);
    }
    public void reflectVertical() {
        this.yDelta = -(this.yDelta);
    }
    public String toString() {
        return "Ball[("+x+","+y+",speed=("+xDelta+","+yDelta+")]";
    }

}
