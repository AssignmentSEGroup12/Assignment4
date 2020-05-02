package svg.element;

public class Rectangle extends Shape {
    private double x;
    private double y;
    private double rx;
    private double ry;
    private double width;
    private double height;

    public Rectangle(double x, double y, double rx, double ry, double width, double height){
        this.x = x;
        this.y = y;
        this.rx = rx;
        this.ry = ry;
        this.width = width;
        this.height = height;
    }

    public void setX(double x){
        this.x = x;
    }

    public void setY(double y){
        this.y = y;
    }

    public void setRx(double rx){
        this.rx = rx;
    }

    public void setRy(double ry){
        this.ry = ry;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public double getRx(){
        return rx;
    }

    public double getRy(){
        return ry;
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    @Override
    public Shape renderShape() {
        return this;
    }
}
