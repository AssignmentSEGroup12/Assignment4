package svg.element;

public class Polygon extends Polyline {
    /*
    private double[] xPoints;
    private double[] yPoints;
    private double points;
    */

    public Polygon(double[] xPoints, double[] yPoints, double points){
        super(xPoints,yPoints,points);
    }

    @Override
    public Shape renderShape() {
        return this;
    }


}
