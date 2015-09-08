//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 13: Write a program which reads 5 numbers into an array and prints the largest number and its location in 
// the array. If the user enters 7, 13, 2, 10, 6 then your program should print “largest number 13 was found at 
// location 1”

import static java.lang.System.*;
import java.util.*;

public class Task13 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[5];//defining array 

		out.println("Enter 5 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		int position = 3;//random position
		int compare = stack[position];

		for(int i=0; i<stack.length; i++) {

			if(stack[i] > compare) {

				compare = stack[i];
				position = i;
			}
		}

		out.println("The largest number you enterd is: "+compare+" index: "+position);
	}
}