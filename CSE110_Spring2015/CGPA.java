//a programm to calcultate cgpa

import static java.lang.System.*;
import java.util.*;

public class CGPA
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter number of course: ");
		int n = input.nextInt();

		double gradesum=0,creditsum=0;

		for(int i=0;i<n;i++)
		{
			out.printf("Enter grade: ");
			double grade = input.nextDouble();

			out.printf("Enter credit: ");
			int credit = input.nextInt();

			gradesum  += (grade*credit);
			creditsum += credit;

		}
	
		double gpa = gradesum/creditsum;

		out.printf("GPA is %.2f\n", gpa);

	}
}
