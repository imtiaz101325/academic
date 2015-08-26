//11/04/15
//Sk. Imtiaz Ahemd
//excalliburbd@gmail.com
//Pre-final self pratice work

import java.util.*;

public class QuadEqn
{
	public int a;
	public int b;
	public int c;

	public double rootEqn()
	{
		return ((Math.sqrt((b*b) - (4*a*c)) - b)/(2*a));
	}

	public String toString()
	{
		if(b<0 && c<0)
			return a+"x2"+b+"x"+c;
		else if(b<0)
			return a+"x2"+b+"x"+"+"+c;
		else if(c<0)
			return a+"x2"+"+"+b+"x"+c;
		else
			return a+"x2"+"+"+b+"x"+"+"+c;
	}
} 