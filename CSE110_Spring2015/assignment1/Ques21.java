import static java.lang.System.*;
import java.util.*;

public class Ques21 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what terms to sum the series: ");

		int n = input.nextInt();

		double sum = 1;

		double series = 1;

		n=n-1;

		for(int i=1; i<=n; i++)
		{
			sum = sum+2;
			series = series + (sum * Math.pow(-1, i));
		}

		out.printf("The sum of the series upto the given value is %.0f\n", series);
	}
}
