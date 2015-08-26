//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 05: Repeat all the four tasks above for two float numbers.

//Repeat of task 03

import static java.lang.System.*;
import java.util.*;

public class Task5c
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		float first = input.nextFloat();

		out.printf("Enter another number: ");
		float second = input.nextFloat();

		if(first!=second)//for different numbers
		{
			if(first>second)
				out.println("first is greater");
			else
				out.println("second is greater");
		}
		else//for same numbers
			out.println("the numbers are equal");


	}
}
