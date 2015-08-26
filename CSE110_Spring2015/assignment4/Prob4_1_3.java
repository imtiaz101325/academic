//2/4/2015
//Sk. Imtiaz Ahmed
//Assignment 3 for Annajiat Rasel-CSE110
//How to Solve it by Computer -R. G. Dromey
//array reversal

import static java.lang.System.*;
import java.util.*;


public class Prob4_1_3
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

		out.print("Enter starting from which position to swap: ");
		int index = k.nextInt();

		int[] temp = new int[index-1];

		for(int i=0; i<temp.length; i++)
		{
			temp[i]=ara[i];
		}

		for(int i=index-1, j=0; i<ara.length; i++,j++)
		{
			ara[j]=ara[i];
		}

		for(int i=ara.length-index+1, j=0; i<ara.length; i++,j++)
		{
			ara[i]=temp[j];
		}


		out.print("[ ");
		for(int each: ara)
		{
			out.print(each+" ");
		}
		out.println("]");
	}
}