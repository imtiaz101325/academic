//07-09-15 Monday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 9: Write a java program that reads 10 numbers from the user. Then read another number from the user, and 
//print “yes” if this number exists among the first 10. Print “no” otherwise.

import static java.lang.System.*;
import java.util.*;

public class Task09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		out.println("Enter a number you whish to search for: ");

		int searchThing = input.nextInt();

		boolean absent = true;

		for(int i=0; i<stack.length; i++) { //query loop

			if(stack[i] == searchThing){

				out.println("Yes");
				absent = false;
				break;
			}
		}

		if(absent) {

			out.println("No");
		}
	}
}