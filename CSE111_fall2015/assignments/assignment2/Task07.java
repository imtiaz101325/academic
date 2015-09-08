//07-09-15 Monday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 7: Write a java program that reads 10 numbers from the user and prints the last even number in the list.

import static java.lang.System.*;
import java.util.*;

public class Task07 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		boolean absent = true;

		for(int i=stack.length-1; i > -1 ; i--) { //finding even nubmer

			if(stack[i]%2 == 0) {

				out.println(stack[i]+" is the last even number.");

				absent = false;//making sure there are even numbers

				break;

			}
		}

		if(absent)
			out.println("No even numbers!");

	}
}