package svg.element;

//-----------------------------------------------------------------------------

import java.util.ArrayList;
import java.util.List;

/**
 * Base SVG element type.
 * @author cambolbro
 */
public abstract class BaseElement implements Element, Prototype
{
	private final String label;

	// Character position in SVG file
	private int filePos;
	
	//-------------------------------------------------------------------------
	
	public BaseElement(final String label)
	{
		this.label = new String(label);
	}

	// factory design pattern
	public static List<Element> elementFactory() {
		return new ArrayList<Element>();
	}

	public Element makeElement(String label) {
		return null;
	}

	//-------------------------------------------------------------------------

	@Override
	public String label()
	{
		return label;
	}
	
	@Override
	public int compare(final Element other)
	{
		return filePos - ((BaseElement)other).filePos;
	}

	//-------------------------------------------------------------------------

	public int filePos()
	{
		return filePos;
	}
	
	public void setFilePos(final int pos)
	{
		filePos = pos;
	}

	//-------------------------------------------------------------------------

}
