//07-09-15 Monday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 10: Write a java program that reads 10 numbers from the user. After reading each number, print all 
// the numbers that have been entered so far. 
// After user enters 11, print 11
// After user enters 22, print 11, 22
// …
// After user enters 99, print 11, 22 ….. 99

import static java.lang.System.*;
import java.util.*;

public class Task10 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			stack[i] = input.nextInt();

			for(int j=0; j<i+1; j++) { //printing loop

				out.print(stack[j]+" ");
			}

			out.println();
		}
	}
}