import static java.lang.System.*;
import java.util.*;

public class Ques22 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the number of courses: ");

		int n = input.nextInt();

		int coursesum = 0;

		int creditsum = 0;

		for(int i=0; i<n; i++)
		{
			out.printf("Enter grade: ");

			int course = input.nextInt();

			out.printf("Enter credit: ");

			int credit = input.nextInt();

			coursesum += (course*credit);

			creditsum += credit;
		}

		double gpa = coursesum/creditsum;

		out.printf("GPA is %.2f", gpa);
	}
}
