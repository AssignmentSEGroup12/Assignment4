package svg.element.shape;

import svg.SVGParser;
import svg.element.Element;

import java.util.List;

public class Circle extends Shape {

    private Double cx;
    private Double cy;
    private Double r;

    public Circle(String label) {
        super("circle");
    }

    @Override
    public Element newInstance() {
        return this;
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

        if (expr.contains(" r="))
        {
            final Double result = SVGParser.extractDouble(expr, " r=");
            if (result != null)
                r = result.doubleValue();
        }

        return (cx != null & cy != null & r != null);
    }

    @Override
    public String toString() {
        return this.label() + ": " + "cx= "+ cx + ", cy= " + cy + ", r= " + r;
    }

}
