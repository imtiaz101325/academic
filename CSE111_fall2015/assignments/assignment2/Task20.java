//08-09-15 Tuesday
//Sk. Imtiaz Ahmed
//excalliburbd@gmail.com
//Assignment for for Md. Shamsul Kaonain CSE111 BRAC University
// Task 20: Create a String array (size 10) consisting of the words “zero”, “one”, “two”……, “nine”. Then take a
//  number (between 0 and 9) from the user and print that number in words from the array. If the user enters 5,
//   you should print a[5] and output should be “five”.

import static java.lang.System.*;
import java.util.*;

public class Task20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		//assing letters to array
		String[] stack = {
							"zero",
							"one",
							"two",
							"three",
							"four",
							"five",
							"six",
							"seven",
							"eight",
							"nine"
						};

		out.println("Enter a number between 0 to 9: ");


		out.println(stack[input.nextInt()]);


	}
}