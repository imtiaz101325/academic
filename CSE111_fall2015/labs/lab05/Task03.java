//16/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab 5
//Task 03: discard negetive numbers in array and resize

import static java.lang.System.*;
import java.util.*;

public class Task03 {

	public static int negetiveTrimmer(int[] inputArray, int arrayLength) {

		boolean[] hasNegetive = new boolean[arrayLength];//holds indexes of the negetive values
														//in the input array
		int hasNegetiveLength = 0;

		//iterate and find negetive values
		for(int i=0; i<arrayLength; i++) {

			if(inputArray[i] < 0) {

				hasNegetive[i] = true;
				hasNegetiveLength++;
			}
		}

		int[] newArray = new int[arrayLength - hasNegetiveLength];//resize

		for(int i=0,j=0; i<arrayLength; i++) {

			if(!hasNegetive[i]) {//exclude negetives

				newArray[j] = inputArray[i];
				j++;
			}
		}

		// //check ouput
		// out.print("[ ");
		// for(int i=0; i<newArray.length; i++) {

		// 	out.print(newArray[i]+" ");
		// }
		// out.println("]");

		// return newArray.length;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.println("Enter how many numbers: ");
		int[] inputArray = new int[input.nextInt()];

		out.println("Please enter the integers: ");
		for(int i=0; i<inputArray.length; i++) {

			out.print(i+1+": ");
			inputArray[i] = input.nextInt();
		}

		out.println("The array length after removing negetive integers is "+
			negetiveTrimmer(inputArray, inputArray.length));
	}
}