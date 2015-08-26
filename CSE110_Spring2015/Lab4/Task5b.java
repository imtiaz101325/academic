//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 05: Repeat all the four tasks above for two float numbers.

//Repeat of task 02

import static java.lang.System.*;
import java.util.*;

public class Task5b
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		float first = input.nextFloat();

		out.printf("Enter another number: ");
		float second = input.nextFloat();

		//compare and output
		if(first>second)
			out.println("first is greater");
		else
			out.println("first is not greater");


	}
}
