//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 01: Write a java program that reads two integers from the user and prints
//“first” if the first number is greater than the second number

import static java.lang.System.*;
import java.util.*;

public class Task1
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter a number: ");//first input
		int first = input.nextInt();

		out.printf("Enter another number: ");//second input
		int second = input.nextInt();

		if(first>second)//compare
			out.println("first");//output


	}
}
