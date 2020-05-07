package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Ellipse extends Shape {

    private Double cx;
    private Double cy;
    private Double rx;
    private Double ry;

    public Ellipse(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return null;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" cx="))
        {
            final Double result = SVGParser.extractDouble(expr, " cx=");
            if (result != null)
                cx = result.doubleValue();
        }

        if (expr.contains(" cy="))
        {
            final Double result = SVGParser.extractDouble(expr, " cy=");
            if (result != null)
                cy = result.doubleValue();
        }

        if (expr.contains(" rx="))
        {
            final Double result = SVGParser.extractDouble(expr, " rx=");
            if (result != null)
                rx = result.doubleValue();
        }
        if (expr.contains(" ry="))
        {
            final Double result = SVGParser.extractDouble(expr, " ry=");
            if (result != null)
                ry = result.doubleValue();
        }

        return (cx != null & cy != null & rx != null & ry != null);
    }

    @Override
    public String toString() {
        return this.label() + ": " + "cx= "+ cx + ", cy= " + cy + ", rx= " + rx + ", ry= " + ry;
    }
}
