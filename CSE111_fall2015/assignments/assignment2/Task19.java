//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 19: Write a java program that reads 10 numbers from the user. 
// Write the program in such a way so that 
// if the user enters 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, then the output should be 1, 3, 5, 7, 9, 2, 4, 6, 8, 10.
// If the user enters 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, then the output should be 10, 30, 50, 70, 90, 20, 40, 60, 80, 100.
// If the user enters 2, 5, 6, 9, 12, 13, 14, 15, 16, 17 then the output should be 2, 6, 12, 14, 16, 5, 9, 13, 15, 17.


import static java.lang.System.*;
import java.util.*;

public class Task19 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.println("Enter 10 numbers: ");//prompt

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

		//starts with (assuming the logic can be applied solely on what the sorted array starts with)

		int logic;

		if(stack[0] > 9){

			logic = 1;

		}else if(stack[0]%2==0) {

			logic = 2;

		}else {

			logic = 3;
		}

		//output logic

		out.print("[ ");

		switch(logic) {


		case 1:

			for(int i=0; i<stack.length; i++) {

				if((stack[i]/10)%2!=0)
					out.print(stack[i]+" ");
			}

			for(int i=0; i<stack.length; i++) {

				if((stack[i]/10)%2==0)
					out.print(stack[i]+" ");
			}

		case 2:

			for(int i=0; i<stack.length; i++) {

				if(stack[i]%2==0)
					out.print(stack[i]+" ");
			}

			for(int i=0; i<stack.length; i++) {

				if(stack[i]%2!=0)
					out.print(stack[i]+" ");
			}

		case 3:

			for(int i=0; i<stack.length; i++) {

				if(stack[i]%2!=0)
					out.print(stack[i]+" ");
			}

			for(int i=0; i<stack.length; i++) {

				if(stack[i]%2==0)
					out.print(stack[i]+" ");
			}



		}

		out.println("]");

	}
}