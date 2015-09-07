//07-09-15 Monday 3:56 am
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 2: Write a java program that reads 10 numbers from the user. The program then reads a number between 0 to 9,
//and shows the number at the corresponding index number. For instance, if the array is a and the user enters 3, 
//your program should print the value a[3].

import static java.lang.System.*;
import java.util.*;

public class Task02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		out.println("Enter index: ");
		out.println("The nubber at that index is " + stack[input.nextInt()] );
	}
}