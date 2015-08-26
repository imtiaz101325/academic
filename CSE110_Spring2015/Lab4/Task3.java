//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 03:Write a java program that reads two integers from the user. Your program 
//should then print “first is greater” if the first number is greater, “second is 
//greater” if the second number is greater, and “the numbers are equal” otherwise.

import static java.lang.System.*;
import java.util.*;

public class Task3
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		int first = input.nextInt();

		out.printf("Enter another number: ");
		int second = input.nextInt();


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
