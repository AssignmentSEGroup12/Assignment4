package svg.element.shape;
import svg.element.Element;

import java.util.ArrayList;

public class Polygon extends Shape {

    private ArrayList<Point2D> listPoints;
    private String points;

    public Polygon(String label) {
        super("polygon");
    }

    @Override
    public Element newInstance() {
        return this;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" points="))
        {
            final int pos    = expr.indexOf("points=");
            final int from   = expr.indexOf("\"", pos);     // opening quote
            final int to     = expr.indexOf("\"", from+1);  // closing quote
            final String sub = expr.substring(from+1, to);
            if (sub != null) {
                points = sub;
                toPoints(points);
            }
        }

        return (points != null);
    }

    private void toPoints(String points) {
        String[] coords = points.split(" ");
        listPoints = new ArrayList<>();
        for (int i = 0; i < coords.length-1; i = i+2) {
            Double x = Double.parseDouble(coords[i]);
            Double y = Double.parseDouble(coords[i+1]);
            Point2D point2D = new Point2D(x, y);
            listPoints.add(point2D);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Point2D p : listPoints) {
            sb.append(p.toString());
        }
        return this.label() + ": " + sb ;
    }
}
