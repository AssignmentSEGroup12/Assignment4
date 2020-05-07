package svg.element;
import svg.element.shape.*;

public class ElementFactory {

    Element[] elementList = {new Circle("circle"), new Line("line"), new Rectangle("rect"),
            new Polyline("polyline"), new Polygon("polygon"), new Ellipse("ellipse")};

    public Element[] prototypes() {
        return elementList;
    }

    public static Element makeElement(String label) {
        switch (label) {
            case "circle":
                return new Circle(label);
            case "ellipse":
                return new Ellipse(label);
            case "rect":
                return new Rectangle(label);
            case "line":
                return new Line(label);
            case "polyline":
                return new Polyline(label);
            case "polygon":
                return new Polygon(label);
            default:
                return null;
        }
    }
}
