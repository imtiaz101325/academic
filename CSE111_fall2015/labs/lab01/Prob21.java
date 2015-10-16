//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 21) Hollow Rectangle using solution of PROBLEM 16) Rectangle 
// Display a rectangle of given length and width. 
// Sample input:
// 4
// 5
// Sample output
// *****
// *   *
// *   *
// *****

import static java.lang.System.*;
import java.util.*;

public class Prob21 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		out.print("Enter width: ");
		int w = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=1; j<=w; j++) {

				if(i==1 || i==h) {

					out.print("*");
				}
				else if(j==1 || j==w) {

					out.print("*");
				}
				else {

					out.print(" ");
				}
			}
			out.println();
		}
	}
}