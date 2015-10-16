//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 14) Palindromic  Triangle
// Sample input:
// 5
// Sample output
//     1
//    121
//   12321
//  1234321
// 123454321

import static java.lang.System.*;
import java.util.*;

public class Prob14 {

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

				out.print(j);
			}

			j-=2;
			for(int k=0; k<i-1; k++) {

				out.print(j);
				j--;
			}

			out.println();
		}

		out.println();
	}
}