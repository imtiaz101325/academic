//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 02:Write a java program that reads two integers from the user. Your program should then print 
//“first is greater” if the first number is greater, and “first is not greater” 
//otherwise.

import static java.lang.System.*;
import java.util.*;

public class Task2
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter a number: ");
		int first = input.nextInt();

		out.printf("Enter another number: ");
		int second = input.nextInt();

		//compare and output
		if(first>second)
			out.println("first is greater");
		else
			out.println("first is not greater");


	}
}
