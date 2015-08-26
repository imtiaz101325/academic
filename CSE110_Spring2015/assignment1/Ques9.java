import static java.lang.System.*;
import java.util.*;

public class Ques9
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Give a number of which a times table will be printed: ");

		int num = input.nextInt();

		out.printf("Upto what times to print the table: ");

		int times = input.nextInt();

		for(int i=1; i<=times; i++)
		{
			int product = num*i;

			out.printf("%d x %d = %d\n", num, i, product);

		}
	}
}
