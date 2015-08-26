import static java.lang.System.*;
import java.util.*;

public class Ques18c
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what terms to print the series: ");

		int n = input.nextInt();

		int sum = 2;

		int step = 2;

		n = n-1;

		for(int i=0; i<n; i++ )
		{
			step = step+2;
			sum = sum+step;
		}

		out.printf("Summation upto the given tem is %d\n", sum);
	}
}
