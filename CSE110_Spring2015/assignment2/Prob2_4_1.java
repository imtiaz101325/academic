//Sk. Imtiaz Ahmed
//10.3.15 Tuesday
//assignmet 2 for Annajiat Ralsel-CSE110
//How to solve it by computer- R. G. Dromey
//Problem 2.4.1 For a given n, design an algorithm to compute 1/n!

import static java.lang.System.*;
import java.util.*;

public class Prob2_4_1
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the value to compute: ");
		int n = input.nextInt();

		double p = 1;

		if(n==0)
			out.printf("1/%d! is 1\n", n);
		else
		{
			for(int c=1; c<=n; c++)
			{
				p *= c;
			}

			out.printf("1/%d! is %f\n", n,1/p);
		}
		
	}
}