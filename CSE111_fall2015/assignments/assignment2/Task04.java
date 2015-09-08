//07-09-15 Monday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 4: Write a java program that reads 10 numbers from the user and prints the first odd number 
//in the list.

import static java.lang.System.*;
import java.util.*;

public class Task04 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		boolean absent = true;

		for(int i=0; i < stack.length; i++) { //finding odd nubmer

			if(stack[i]%2 != 0) {

				out.println(stack[i]+" is the first odd number.");

				absent = false;//making sure there are odd numbers

				break;

			}
		}

		if(absent)
			out.println("No odd numbers!");

	}
}