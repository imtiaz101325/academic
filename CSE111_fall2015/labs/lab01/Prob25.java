//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 25) Hollow  Rhombus using solution of PROBLEM 20) Rhombus 
// Just draw the image of the above triangle once. And then, the opposite, once.
// Sample input:
// 3
// Sample output
//   *
//  * *
// *   *
//  * *
//   *

import static java.lang.System.*;
import java.util.*;

public class Prob25 {

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

				if(i==1) {

					out.print("*");
				}else if(j==1) {

					out.print("*");
				}
				else {

					out.print(" ");
				}
			}

			for(int k=0; k<i-1; k++) {

				if(i==2) {

					out.print("*");
				}else if(k==i-2) {

					out.print("*");
				}else {

					out.print(" ");
				}
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

				if(i==h-1) {

					out.print("*");
				}else if(j==1) {

					out.print("*");
				}else {

					out.print(" ");
				}
			}

			for(int k=j-1; k>1; k--,j++) {

				
				if(i==h-2) {

					out.print("*");
				}else if(k==2) {

					out.print("*");
				}else {

					out.print(" ");
				}
			}
			out.println();
		}
	}
}