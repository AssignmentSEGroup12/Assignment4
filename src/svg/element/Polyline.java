package svg.element;

public class Polyline extends Shape {
    private double[] xPoints;
    private double[] yPoints;
    private double points;

    public Polyline(double[] xPoints, double[] yPoints, double points){
        this.xPoints = this.xPoints;
        this.yPoints = this.yPoints;
        this.points = this.points;
    }

    public void setXPoints(double[] xPoints){
        this.xPoints = xPoints;
    }

    public void setYPoints(double[] yPoints){
        this.yPoints = yPoints;
    }

    public void setPoints(double points){
        this.points = points;
    }

    public double[] getxPoints(){
        return xPoints;
    }

    public double[] getyPoints(){
        return yPoints;
    }

    public double getPoints(){
        return points;
    }

    @Override
    public Shape renderShape() {
        return this;
    }

}

