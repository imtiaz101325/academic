//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 2: Write a java program that reads five numbers from the user, and prints their average

import static java.lang.System.*;
import java.util.*;

public class Task2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		int sum = 0;//holds the sum of numbers

		for(int i=0; i<5; i++)//a loop for 5 numbers
		{
			out.printf("Enter a number(%d/5): ", i+1);
			int num = input.nextInt();//input

			sum += num;
		}

		double avg = sum/5.0;//average

		out.printf("The average of the five numbers is: %.2f\n", avg);//output

	}
}
