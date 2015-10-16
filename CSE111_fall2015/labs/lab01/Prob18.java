//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 18) Triangle - Right Justified
// Draw right angled triangle of given height
// Sample input:
// 4
// Sample output
//    *
//   **
//  ***
// ****

import static java.lang.System.*;
import java.util.*;

public class Prob18 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=0; j<h-i; j++) {

				out.print(" ");
			}

			for(int j=0; j<i; j++) {

				out.print("*");
			}
			out.println();
		}

		out.println();
	}
}