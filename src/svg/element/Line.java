package svg.element;

import svg.SVGParser;
import svg.element.Element;

public class Line extends Shape {

    private Double x1;
    private Double x2;
    private Double y1;
    private Double y2;

    public Line(String label) {
        super("line");
    }

    @Override
    public Element newInstance() {
        return this;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" x1="))
        {
            final Double result = SVGParser.extractDouble(expr, " x1=");
            if (result != null)
                x1 = result.doubleValue();
        }
        if (expr.contains(" x2="))
        {
            final Double result = SVGParser.extractDouble(expr, " x2=");
            if (result != null)
                x2 = result.doubleValue();
        }
        if (expr.contains(" y1="))
        {
            final Double result = SVGParser.extractDouble(expr, " y1=");
            if (result != null)
                y1 = result.doubleValue();
        }
        if (expr.contains(" y2="))
        {
            final Double result = SVGParser.extractDouble(expr, " y2=");
            if (result != null)
                y2 = result.doubleValue();
        }
        return (x1 != null && x2 != null && y1 != null && y2 != null);
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
