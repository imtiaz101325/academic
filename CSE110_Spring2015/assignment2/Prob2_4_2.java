//Sk. Imtiaz Ahmed
//10.3.15 Tuesday
//assignmet 2 for Annajiat Ralsel-CSE110
//How to solve it by computer- R. G. Dromey
//Problem 2.4.2
//For a given x and a given n, design an algorithm to compute x^n/n!

import static java.lang.System.*;
import java.util.*;

public class Prob2_4_2
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(in);

		out.printf("Enter x where x^n/n! will be computed: ");
		double x = input.nextDouble();

		out.printf("Enter n where x^n/n! will be computed: ");
		double n = input.nextDouble();

		double xProduct = 1, nProduct = 1;

		if(n==0)
			out.printf("%.0f^%.0f/%.0f! is %f\n", x, n, n, 1.0);
		else
		{
			for(int c=1; c<=n; c++)
			{
				nProduct *= c;
			}
			for(int c=1; c<=n; c++)
			{
				xProduct *= x;
			}

			out.printf("%.0f^%.0f/%.0f! is %f\n", x, n, n, xProduct/nProduct);
		}



		

	}
}