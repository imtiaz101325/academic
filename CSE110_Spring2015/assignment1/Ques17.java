import static java.lang.System.*;
import java.util.*;

public class Ques17 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("How many values to find the mean of: ");

		int n = input.nextInt();

		double sum = 0;

		for(int i=0; i<n; i++)
		{
			out.printf("Enter a value: ");

			double value = input.nextInt();

			value = 1/value;

			sum = sum+value;
		}

		double mean = n/sum;

		out.printf("The hermonic mean of the values is %.2f\n", mean);

		
	}
}
