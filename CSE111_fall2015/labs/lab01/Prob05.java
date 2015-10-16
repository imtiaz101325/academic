//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 5) Triangle - Right Justified
// Draw right angled triangle of given height
// Sample input:
// 4
// Sample output
//    1
//   12
//  123
// 1234

import static java.lang.System.*;
import java.util.*;

public class Prob05 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=0; j<h-i; j++) {

				out.print(" ");
			}

			for(int j=0; j<i; j++) {

				out.print(j+1);
			}
			out.println();
		}

		out.println();
	}
}