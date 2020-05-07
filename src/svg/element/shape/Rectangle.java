package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

public class Rectangle extends Shape {

    private Double x;
    private Double y;
    private Double rx;
    private Double ry;
    private Double width;
    private Double height;

    public Rectangle(String label) {
        super(label);
    }

    @Override
    public Element newInstance() {
        return this;
    }

    @Override
    public boolean load(String expr) {
        if (expr.contains(" x="))
        {
            final Double result = SVGParser.extractDouble(expr, " x=");
            if (result != null)
                x = result.doubleValue();
        }
        if (expr.contains(" y="))
        {
            final Double result = SVGParser.extractDouble(expr, " y=");
            if (result != null)
                y = result.doubleValue();
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
        if (expr.contains(" width="))
        {
            final Double result = SVGParser.extractDouble(expr, " width=");
            if (result != null)
                width = result.doubleValue();
        }
        if (expr.contains(" height="))
        {
            final Double result = SVGParser.extractDouble(expr, " height=");
            if (result != null)
                height = result.doubleValue();
        }
        return (x != null && y != null && width != null && height != null);
    }

    @Override
    public String toString() {
        String res = this.label() + ": " + "x= "+ x + ", y= " + y + ", width= " + width + ", height= " + height;
        if (rx != null && ry != null)
            res += ", rx= " + rx + ", ry= " + ry;
        return res;
    }
}
