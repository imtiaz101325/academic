import static java.lang.System.*;
import java.util.*;


public class Ques2
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the grade of CSE110 out of 4.0: ");

		double cse110 = input.nextDouble();

		out.printf("Enter the grade of ENG091 out of 4.0: ");

		double eng091 = input.nextDouble();

		out.printf("Enter the grade of MAT110 out of 4.0: ");

		double mat110 = input.nextDouble();

		out.printf("Enter the grade of PHY111 out of 4.0: ");

		double phy111 = input.nextDouble();

		int cseCredit = 3;
		int engCredit = 0;
		int matCredit = 3;
		int phyCredit = 3;

		double gpa = (cse110*cseCredit+eng091*engCredit+mat110*matCredit+phy111*phyCredit)/(cseCredit+engCredit+matCredit+phyCredit);

		out.printf("GPA is: %f\n", gpa);

	}
}
