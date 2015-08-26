//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 07: Write a java program that reads an integer, and if the number is even and 
//greater than 10, prints “An even number greater than 10”. If the number is even but 
//lesser than 10, print “An even number not greater than 10”. If the number is greater 
//than 10 but odd, print “An odd number greater than 10”. If the number is odd and also 
//less than 10, print “An odd number less than 10”.

import static java.lang.System.*;
import java.util.*;

public class Task7
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//input
		out.printf("Enter a number: ");
		int num = input.nextInt();

		//compare and output
		if(num%2==0)
			if(num>10)
				out.println("An even number greater than 10");
			else
				out.println("An even number not greater than 10");
		else if(num>10)
			out.println("An odd number greater than 10");
		else
			out.println("An odd number not greater than 10");	



	}
}
