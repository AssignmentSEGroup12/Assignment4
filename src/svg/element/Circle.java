package svg.element;

public class Circle extends Shape {
    private double cx;
    private double cy;
    private double r;

    public Circle(double cx,double cy,double r){
        this.cx = cx;
        this.cy = cy;
        this.r = r;
    }

    public void setCenter(double cx,double cy){
        this.cx = cx;
        this.cy = cy;
    }

    public void setRadius(double r){
        this.r = r;
    }

    public double getCx(){
        return cx;
    }

    public double getCy(){
        return cy;
    }

    public double getRadius(){
        return r;
    }

    @Override
    public Shape renderShape() {
        return this;
    }


}
