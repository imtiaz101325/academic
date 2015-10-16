//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 8) Hollow Rectangle
// Display a rectangle of given length and width. 
// Sample input:
// 4
// 5
// Sample output
// 12345
// 1   5
// 1   5
// 12345

import static java.lang.System.*;
import java.util.*;

public class Prob08 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		out.print("Enter width: ");
		int w = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=1; j<=w; j++) {

				if(i==1 || i==h) {

					out.print(j);
				}
				else if(j==1 || j==w) {

					out.print(j);
				}
				else {

					out.print(" ");
				}
			}
			out.println();
		}
	}
}