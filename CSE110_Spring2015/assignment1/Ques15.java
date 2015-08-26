import static java.lang.System.*;
import java.util.*;

public class Ques15 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter how many numbers to sum: ");

		int n = input.nextInt();

		out.printf("Enter the first number: ");

		int first = input.nextInt();

		out.printf("Enter the second number: ");

		int second = input.nextInt();

		int sum = first+second;

		n = n-2;

		for(int i=0; i<n; i++)
		{
			out.printf("Enter antoher number: ");

			int num = input.nextInt();

			sum = sum+num;

		}

		out.printf("The summation of the numbers is %d\n", sum);
	}
}
