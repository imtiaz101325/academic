//07-09-15 Monday 4:13 am
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 3: Write a java program that reads 10 numbers from the user, and then prints them in the reverse order.

import static java.lang.System.*;
import java.util.*;

public class Task03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		out.print("[");
		for(int i=stack.length-1; i > -1; i--) { //output loop

			out.print(stack[i]+" ");
		}
		out.println("]");
	}
}