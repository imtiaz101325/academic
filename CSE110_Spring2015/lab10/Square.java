//April 7, 2015
//Sk. Imtiaz Ahmed
//Lab tasks for Md. Shamsul Kaonain CSE110
//Task 03: Square class

import static java.lang.System.*;
import java.util.*;

public class Square
{
	//public fields
	public double height;
	public double width;

	//public methods
	public double getHeight()
	{
		return height;
	}

	public void setHeight(double h)
	{
		height = h;
	}

	public double getWidth()
	{
		return width;
	}

	public void setWidth(double w)
	{
		width = w;
	}

	public double getArea()
	{
		return height*width;
	}
}