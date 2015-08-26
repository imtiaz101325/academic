//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 06: Write a java program that reads an integer, and prints “The number is even” or “The 
//number is odd”, depending on whether the number is even or odd. (Hint: use the modulus 
//operator)

import static java.lang.System.*;
import java.util.*;

public class Task6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input		
		out.printf("Enter a number: ");
		int num = input.nextInt();

		if(num%2==0)//compare and output
			out.println("The number is even");
		else
			out.println("The number is odd");



	}
}
