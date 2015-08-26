import static java.lang.System.*;
import java.util.*;

public class Ques18d 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what terms to print the series: ");

		int n = input.nextInt();

		double ans = 1;

		double sum = 1;

		n = n-1;

		for(int i=0; i<n; i++ )
		{
			sum++;
			
			ans += 1/sum;
		}

		out.printf("Summation upto the given tem is %.2f\n", ans);
	}
}
