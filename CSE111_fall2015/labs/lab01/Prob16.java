//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 16) Rectangle using solution of PROBLEM 15) Star Line
// Sample input:
// 4
// 6
// Sample output
// ******
// ******
// ******
// ******


import static java.lang.System.*;
import java.util.*;

public class Prob16	 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		out.print("Enter width: ");
		int w = input.nextInt();


		for(int i=0; i<h; i++) {

			for(int j=0; j<w; j++) {

				out.print("*");
			}

			out.println();
		}

		out.println();
	}
}