//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 1: Write a java program that reads five numbers as input from the user, and 
//prints whether the numbers are odd or even.

import static java.lang.System.*;
import java.util.*;

public class Task1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		for(int i=0; i<5; i++)
		{
			out.printf("Enter a number(%d/5): ",i+1);//input
			int num = input.nextInt();

			if(num%2==0)//comparison and output
				out.printf("%d is even.\n",num);
			else
				out.printf("%d is odd.\n",num);

		}


	}
}
