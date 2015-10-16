//16/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab 5
//Task 02: Second most often letter

import static java.lang.System.*;
import java.util.*;

public class Task02 {

	public static void main(String[] args) {

		int[] placeholder = new int[91];//this holds ascii values

		Scanner input = new Scanner(in);

		out.println("Enter a wrod in all caps: ");
		String userInput = input.next();
		input.nextLine();

		int len = userInput.length();
		for(int i=0; i<len; i++) {

			placeholder[userInput.codePointAt(i)]++;//updates ascii values
		}

		//find max
		int maxIndex = 0;
		int max = placeholder[maxIndex];

		for(int i=65; i<placeholder.length; i++) {

			if(placeholder[i] > max) {

				max = placeholder[i];
				maxIndex = i;
			}
		}

		//find second max
		int secondMaxIndex = 0;
		int secondMax = placeholder[secondMaxIndex];

		for(int i=65; i<placeholder.length; i++) {

			if(i != maxIndex && placeholder[i] > secondMax) {

				secondMax = placeholder[i];
				secondMaxIndex = i;
			}
		}


		out.println((char) secondMaxIndex);

	}
}