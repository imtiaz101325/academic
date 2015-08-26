//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 08: Write a java program that reads an integer, and prints the integer if it is 
//a multiple of either 2 or 5.

import static java.lang.System.*;
import java.util.*;

public class Task8_1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		int num = input.nextInt();

		//either 2
		if(num%2==0)
			out.println(num);
		//or 5
		else if(num%5==0)
			out.println(num);
		

	}
}
