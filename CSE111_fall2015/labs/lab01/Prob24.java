//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 24) Hollow  Triangle – Isosceles using solution of PROBLEM 19) Triangle - Isosceles
// Draw triangle of given height
// Sample input 1:
// 3
// Sample output 1:
//   *
//  * *
// *****

// Sample input 2:
// 4
// Sample output 2:
//    *
//   * *
//  *   *
// *******

import static java.lang.System.*;
import java.util.*;

public class Prob24 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=0; j<h-i; j++) {

				out.print(" ");
			}

			int j=1;
			for(; j<=i; j++) {

				if(i==1 || i==h) {

					out.print("*");
				}
				else if(j==1) {

					out.print("*");
				}
				else {

					out.print(" ");
				}
			}

			for(int k=0; k<i-1; k++) {

				if(i==2 || i==h) {

					out.print("*");
				}
				else if(k==i-2) {

					out.print("*");
				}
				else {

					out.print(" ");
				}
				j++;
			}

			out.println();
		}

		out.println();
	}
}