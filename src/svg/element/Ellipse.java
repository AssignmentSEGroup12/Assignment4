package svg.element;

public class Ellipse extends Shape {
    private double cx;
    private double cy;
    private double rx;
    private double ry;

    public Ellipse(double cx, double cy, double rx, double ry){
        this.cx = cx;
        this.cy = cy;
        this.rx = rx;
        this.ry = ry;
    }

    public void setRx(double rx){
        this.rx = rx;
    }

    public void setRy(double ry){
        this.ry = ry;
    }

    public void setCx(double cx){
        this.cx = cx;
    }

    public void setCy(double cy){
        this.cy = cy;
    }

    public double getRx(){
        return rx;
    }

    public double getRy(){
        return ry;
    }

    public double getCx(){
        return cx;
    }

    public double getCy(){
        return cy;
    }

    @Override
    public Shape renderShape() {
        return this;
    }
}
