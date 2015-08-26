import static java.lang.System.*;
import java.util.*;

public class Ques16 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter how many numbers to sum: ");

		int n = input.nextInt();

		int sum = 0;

		for(int i=0; i<n; i++)
		{
			out.printf("Enter the number: ");

			int num = input.nextInt();

			num = num*num;

			sum = sum+num;
		}

		out.printf("The summation of the square of the numbers are %d\n", sum);
	}
}
