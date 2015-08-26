import static java.lang.System.*;
import java.util.*;

public class Ques18a 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter upto what terms to print the summation: ");

		int n = input.nextInt();

		int sum = 0;

		for(int i=1; i<=n; i++)
		{
			sum+=i;
		}

		out.printf("The summation upto the given term is %d\n", sum);
	}
}
