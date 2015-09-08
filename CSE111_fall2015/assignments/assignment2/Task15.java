//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 15: Write a program which reads 5 numbers into an array, sorts/arranges the numbers from low to high and prints
//all numbers in the array. If the user enters 7, 13, 2, 10, 6 then your program should print 2, 6, 7, 10, and 13.

import static java.lang.System.*;
import java.util.*;

public class Task15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[5];//defining array 

		out.println("Enter 5 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		//buble sort
		for(int i=0; i<stack.length-1; i++) {

			for(int j=i; j<stack.length; j++) {

				if(stack[j] < stack[i]) {

					int temp = stack[i];
					stack[i] = stack[j];
					stack[j] = temp;
				}
			}
		}

		//output loop
		out.print("Sorter in asscending order: [ ");
		for(int i=0; i<stack.length; i++) {

			out.print(stack[i]+ " ");
		}
		out.println("]");

	}
}