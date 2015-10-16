//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 12) Hollow  Rhombus 
// Just draw the image of the above triangle once. And then, the opposite, once.
// Sample input:
// 3
// Sample output
//   1
//  1 3
// 1   5
//  1 3
//   1

import static java.lang.System.*;
import java.util.*;

public class Prob12 {

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

					out.print(j);
				}else if(j==1) {

					out.print(j);
				}
				else {

					out.print(" ");
				}
			}

			for(int k=0; k<i-1; k++) {

				if(i==2) {

					out.print(j);
				}else if(k==i-2) {

					out.print(j);
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

					out.print(j);
				}else if(j==1) {

					out.print(j);
				}else {

					out.print(" ");
				}
			}

			for(int k=j-1; k>1; k--,j++) {

				
				if(i==h-2) {

					out.print(j);
				}else if(k==2) {

					out.print(j);
				}else {

					out.print(" ");
				}
			}
			out.println();
		}
	}
}