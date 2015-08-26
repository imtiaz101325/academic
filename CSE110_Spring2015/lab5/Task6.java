//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 6: Repeat task 2 for twenty numbers

import static java.lang.System.*;
import java.util.*;

public class Task6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		int sum = 0;//holds the sum of numbers

		for(int i=0; i<20; i++)//a loop for 20 numbers
		{
			out.printf("Enter a number(%d/20): ", i+1);
			int num = input.nextInt();//input

			sum += num;
		}

		double avg = sum/20.0;//average

		out.printf("The average of the five numbers is: %.2f\n", avg);//output

	}
}
