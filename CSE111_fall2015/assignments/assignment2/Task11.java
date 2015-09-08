//07-09-15 Monday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 11: Write a java program that reads 10 numbers from the user, but does not allow the user to enter duplicates. 
//This means that if a number has been entered already, the program will not accept it as input again and instead 
//ask the user to enter a different number.

//note to self: rethink logic on like#36

import static java.lang.System.*;
import java.util.*;

public class Task11 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print("Enter next number: ");

			int temp = input.nextInt();

			for(int j=0; j<i+1; j++) { //verify loop

				if(stack[j] == temp) {

					out.println("Already exists!");

					i--;//redo this position
					continue;
				}
			}

			stack[i] = temp;

			out.println();
		}

	// out.print("[ ");
	// for(int i=0; i<stack.length; i++) {

	// 	out.print(stack[i]+" ");
	// }
	// out.println("]");

	}
}