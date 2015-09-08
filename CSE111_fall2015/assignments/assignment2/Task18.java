//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 18: Write a java program that reads 15 numbers from the user, 
// all the numbers within the range 0-9. Then print the number of times each number has been entered by the user.

import static java.lang.System.*;
import java.util.*;

public class Task18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];

		out.println("Enter 15 numbers within the range of 0-9: ");

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			int temp = input.nextInt();

			if(temp < 10 && temp > -1) { //input restraint logic

				stack[temp]++;

			} else {

				out.println("Invalid input. Please enter within the range of 0-9");
				i--;
				continue;
			}
		}

		for(int i=0; i<stack.length; i++) {

			out.println("You entered "+i+": "+stack[i]+" times");
		}

	}
}