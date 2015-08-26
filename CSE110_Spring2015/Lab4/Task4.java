//Sk. Imtiaz Ahmed
//March 04, 2015
//Lab task for Md. Shamsul Kaonain
//Task 04: Write a java program that reads two integers, subtracts the smaller number 
//from the larger one, and prints the result.

import static java.lang.System.*;
import java.util.*;

public class Task4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		int first = input.nextInt();

		out.printf("Enter another number: ");
		int second = input.nextInt();

		int diff;//holds the result

		if(first>second)//substract larger form the smaller
			diff = first-second;
		else
			diff = second-first;

		out.println(diff);//output


	}
}
