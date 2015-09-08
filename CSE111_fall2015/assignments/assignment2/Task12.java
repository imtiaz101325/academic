//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 12 Write a program which reads 5 numbers into an array and prints the largest number. If the user 
// enters 7, 13, 2, 10, 6 then your program should print 13.

import static java.lang.System.*;
import java.util.*;

public class Task12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[5];//defining array 

		out.println("Enter 5 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		int compare = stack[3];//random present value

		for(int i=0; i<stack.length; i++) {

			if(stack[i] > compare)
				compare = stack[i];
		}

		out.println("The largest number you enterd is: "+compare);
	}
}