//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 10: Write a java program that reads a student’s mark for a single subject, 
//and prints out the corresponding grade for that mark

import static java.lang.System.*;
import java.util.*;

public class Task10
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);
		
		//input
		out.printf("Enter your mark: ");
		int mark = input.nextInt();

		if(mark<50)//Below 50
			out.println("F");
		else if(mark<60)//50-59
			out.println("E");
		else if(mark<70)//60-69
			out.println("D");
		else if(mark<80)//70-79
			out.println("C");
		else if(mark<90)//80-89
			out.println("B");
		else//90 and above
			out.println("A");

	}
}
