//2/4/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//array reversal

import static java.lang.System.*;
import java.util.*;


public class Prob4_1_2
{
	public static void main(String[] args) 
	{
		Scanner k = new Scanner(in);

		out.print("Please enter how many elements: ");
		int n = k.nextInt();

		int[] ara = new int[n];

		for(int i=0; i<ara.length; i++)
		{
			out.print("Please enter next number: ");
			ara[i] = k.nextInt();
		}

		for(int i=0,j=n-1; i<j; i++,j--)
		{
			int temp = ara[i];
			ara[i] = ara[j];
			ara[j] = temp;
		}

		out.print("[ ");
		for(int each: ara)
		{
			out.print(each+" ");
		}
		out.println("]");
	}
}