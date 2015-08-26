//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 05: Repeat all the four tasks above for two float numbers.

//Repeat of task 04

import static java.lang.System.*;
import java.util.*;

public class Task5d
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		float first = input.nextFloat();

		out.printf("Enter another number: ");
		float second = input.nextFloat();

		float diff;//holds the result

		if(first>second)//substract larger form the smaller
			diff = first-second;
		else
			diff = second-first;

		out.printf("%.2f",diff);//output


	}
}
