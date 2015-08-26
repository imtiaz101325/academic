//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 5: Repeat task 1 for twenty numbers

import static java.lang.System.*;
import java.util.*;

public class Task5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		for(int i=0; i<20; i++)//a loop for 20 numbers
		{
			out.printf("Enter a number(%d/20): ",i+1);
			int num = input.nextInt();//input

			if(num%2==0)//comparison and output
				out.printf("%d is even.\n",num);
			else
				out.printf("%d is odd.\n",num);

		}


	}
}
