import static java.lang.System.*;
import java.util.*;

public class Ques14 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter how many numbers to average: ");

		int n = input.nextInt();

		int sum = 0;

		for(int i=0; i<n; i++)
		{
			out.printf("Enter a number: ");
			
			int num = input.nextInt();

			sum = sum+num;
		}
		
		double avg = sum/n;
		
		out.printf("Average of the numbers is %.2f\n", avg);	
	}
}
