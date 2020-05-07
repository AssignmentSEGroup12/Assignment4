package svg.element.shape;

import svg.element.Element;

public class Point2D {

    private Double x;
    private Double y;

    public Point2D (Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + " ," + y + ")";
    }

}
