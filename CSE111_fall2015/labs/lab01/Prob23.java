//09-09-15 Wednessday
//Sk. Imtiaz Ahmed
//CSE11 lab work for Tamal Adhikary BRAC University
// PROBLEM 23) Hollow Triangle - Right Justified using solution of PROBLEM 18) Triangle - Right Justified
// Draw right angled triangle of given height
// Sample input:
// 5
// Sample output
//     *
//    **
//   * *
//  *  *
// *****
import static java.lang.System.*;
import java.util.*;

public class Prob23 {

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		out.print("Enter hight: ");
		int h = input.nextInt();

		for(int i=0; i<h; i++) {

			int j=1;
			for(; j<h-i; j++) {

				out.print(" ");
			}

			for(;j<=h;j++) {

				if(i==0 || i==h-1) {

					out.print("*");
				}
				else if(j==h || j==h-i) {

					out.print("*");
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