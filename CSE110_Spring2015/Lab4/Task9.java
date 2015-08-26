//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 09: Write a java program that reads a student’s mark for a single subject, 
//and prints out “Pass” if the student got more than 50, and “You shall not pass” 
//otherwise.

import static java.lang.System.*;
import java.util.*;

public class Task9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		//input
		out.printf("Enter your mark: ");
		int mark = input.nextInt();

		if(mark>50)//more than 50
			out.println("Pass");
		else
			out.println("Your shall not pass");

	}
}
