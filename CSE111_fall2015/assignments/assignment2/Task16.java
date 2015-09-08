//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 16 Write a program which reads 5 numbers into an array, sorts/arranges the numbers from high to low and 
// prints all numbers in the array. If the user enters 7, 13, 2, 10, 6 then your program should 
// print 13, 10, 7, 6, 2

import static java.lang.System.*;
import java.util.*;

public class Task16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[5];//defining array 

		out.println("Enter 5 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		//bubble sort
		for(int i=0; i<stack.length-1; i++) {

			for(int j=i; j<stack.length; j++) {

				if(stack[j] > stack[i]) {

					int temp = stack[i];
					stack[i] = stack[j];
					stack[j] = temp;
				}
			}
		}

		//output loop
		out.print("Sorter in desscending order: [ ");
		for(int i=0; i<stack.length; i++) {

			out.print(stack[i]+ " ");
		}
		out.println("]");

	}
}