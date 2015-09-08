//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 17 Write a program which asks the user how many numbers to take. Then takes that many numbers and prints
//the median value. Read www.mathsisfun.com/median.html If the user gives 10, 50, 40, 20, 30. Then the median is 30
//(because 30 falls in middle 10, 20, 30, 40, 50) If the user gives 30, 10, 40, 20. Then the median is 25 because,
//(20+30)/2=25(average of two middle values from 10, 20, 30, 40)

//note to self: took too much time to sort out the logic

import static java.lang.System.*;
import java.util.*;

public class Task17 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.println("How many numbers do you wish to enter: ");//prompt

		int[] stack = new int[input.nextInt()];//defining array 

		out.println("Enter the numbers: ");

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		//bubble sort
		for(int i=0; i<stack.length-1; i++) {

			for(int j=i; j<stack.length; j++) {

				if(stack[j] < stack[i]) {

					int temp = stack[i];
					stack[i] = stack[j];
					stack[j] = temp;
				}
			}
		}

		// out.print("[ ");
		// for(int i=0; i<stack.length; i++) {

		// 	out.print(stack[i]+" ");
		// }
		// out.println("]");


		out.print("The median is: ");

		int div = (int)(stack.length/2);

		if(stack.length%2 == 0) {

			out.println((stack[div] + stack[div-1])/2.0);


		} else {

			out.println(stack[div]);
		}

	}
}