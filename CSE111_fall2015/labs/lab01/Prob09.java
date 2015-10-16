//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 9) Hollow Triangle - Left Justified
// Draw right angled triangle of given height
// Sample input:
// 5
// Sample output
// 1
// 12
// 1 3
// 1  4
// 12345

import static java.lang.System.*;
import java.util.*;

public class Prob09 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=1; i<=h; i++) {

			for(int j=1; j<=i; j++) {

				if(i==1 || i==h) {

					out.print(j);
				}
				else if(j==1 || j==i) {

					out.print(j);
				}
				else {

					out.print(" ");
				}
			}

			out.println();
		}

		out.println();
	}
}