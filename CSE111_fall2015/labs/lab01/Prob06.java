//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 6) Triangle - Isosceles
// Draw triangle of given height
// Sample input 1:
// 3
// Sample output 1:
//   1
//  123
// 12345

import static java.lang.System.*;
import java.util.*;

public class Prob06 {

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

		out.println();
	}
}