//07-09-15 Monday 3:34 am
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 1: Write a java program that would input three numbers from the user and print sum, then the first number, 
//then the 2nd number followed by 3rd number. If user enters 10, 20, 30. Then output should be 60, 10, 20, and 30.

import static java.lang.System.*;
import java.util.*;

public class Task01 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.println("Enter three numbers: ");

		int[] stack = new int[3]; //doing the task in a array for future scalability

		int sum = 0;

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();

			sum += stack[i]; // adding up the numbers

			//out.println();
		}


		out.print(sum); //print sum

		for(int i=0; i<stack.length; i++) {

			out.print(", "+stack[i]);// print numbers
		}

		out.println();
	}
}