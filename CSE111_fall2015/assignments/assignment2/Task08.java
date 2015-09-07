//07-09-15 Monday 4:47 am
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
//Task 8: Write a java program that reads 10 numbers from the user, and then prints only the even numbers 
//in reverse order.
import static java.lang.System.*;
import java.util.*;

public class Task08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int[] stack = new int[10];//defining array 

		out.println("Enter 10 numbers: ");//prompt

		for(int i=0; i<stack.length; i++) { //input loop

			out.print((i+1)+": ");

			stack[i] = input.nextInt();
		}

		boolean absent = true;

		for(int i=stack.length-1; i > -1 ; i--) { //finding even nubmer

			if(stack[i]%2 == 0) {

				out.println(stack[i]+" is the last even number.");

				absent = false;//making sure there are even numbers
			}
		}

		if(absent)
			out.println("No even numbers!");

	}
}