//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 7) Rhombus
// Just draw the image of the above triangle once. And then, the opposite, once.
// Sample input:
// 3
// Sample output
//   1
//  123
// 12345
//  123
//   1

import static java.lang.System.*;
import java.util.*;

public class Prob07 {

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

				out.print(j+1);
			}

			j++;

			for(int k=0; k<i-1; k++) {

				out.print(j);
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

				out.print(j);
			}

			for(int k=j-1; k>1; k--,j++) {

				out.print(j);
			}
			out.println();
		}
	}
}