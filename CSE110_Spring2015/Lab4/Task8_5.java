//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 08: Write a java program that reads an integer, and prints the integer if it is 
//NOT a multiple of 2 OR NOT a multiple of 5.

import static java.lang.System.*;
import java.util.*;

public class Task8_5
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//input
		out.printf("Enter a number: ");
		int num = input.nextInt();

		if(num%2!=0)//not a multiple of 2
			out.println(num);
		else if(num%5!=0)//or not a multiple of 5
			out.println(num);

	}
}
