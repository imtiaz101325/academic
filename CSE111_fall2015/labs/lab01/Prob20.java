//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 20) Rhombus using PROBLEM 19) Triangle - Isosceles
// Just draw the image of the above triangle once.  And then, the opposite, once.
// Sample input:
// 3
// Sample output
//   *
//  ***
// *****
//  ***
//   *

import static java.lang.System.*;
import java.util.*;

public class Prob20 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=0; j<h-i; j++) {

				out.print(" ");
			}

			int j=0;
			for(; j<i; j++) {

				out.print("*");
			}

			j++;

			for(int k=0; k<i-1; k++) {

				out.print("*");
				j++;
			}

			out.println();
		}

		int temp = h;
		for(int i=1; i<h; i++) {

			for(int j=0; j<i; j++) {

				out.print(" ");
			}

			int j=1;
			for(; j<=h-i; j++) {

				out.print("*");
			}

			for(int k=j-1; k>1; k--,j++) {

				out.print("*");
			}
			out.println();
		}
	}
}