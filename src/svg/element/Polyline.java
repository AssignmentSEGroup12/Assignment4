package svg.element;

import svg.SVGParser;
import svg.element.Element;

import java.util.ArrayList;

public class Polyline extends Shape {

    private ArrayList<Point2D> listPoints;
    private String points;

    public Polyline(String label) {
        super("polyline");
    }

    @Override
    public Element newInstance() {
        return this;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" points="))
        {
            final String result = SVGParser.extractStringAt(expr, -1);
            if (result != null) {
                points = result;
                toPoints(points);
                return true;
            }
        }

        return false;
    }

    private void toPoints(String expr) {
        String[] coords = expr.split(" ");
        for (int i = 0; i < coords.length; i = i+2) {
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

    @Override
    public List<Element> prototypes() {
        try {
            return (Element) this.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
