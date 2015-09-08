//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 14: Write a program which reads 5 numbers into an array and prints the smallest and largest number and their 
// location in the array. If the user enters 7, 13, -5, 10, 6 then your program should print “Smallest number -5 was 
// found at location 2”. “Largest number 13 was found at location 1”.

import static java.lang.System.*;
import java.util.*;

public class Task14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[5];//defining array 

		out.println("Enter 5 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		int position1 = 3, position2 = 0;//random positons
		int largest = stack[position1], smallest = stack[position2];

		for(int i=0; i<stack.length; i++) {

			if(stack[i] > largest ) {

				largest = stack[i];
				position1 = i;
			}

			if(stack[i] < smallest ) {

				smallest = stack[i];
				position2 = i;
			}
		}

		out.println("The largest number you enterd is: "+largest+" index: "+position1);
		out.println("The smallest number you enterd is: "+smallest+" index: "+position2);

	}
}