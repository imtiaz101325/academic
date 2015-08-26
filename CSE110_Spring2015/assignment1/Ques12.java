import static java.lang.System.*;
import java.util.*;

public class Ques12
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter how many numbers are there is the list: ");

		int list = input.nextInt();

		int neg=0;
		int pos=0;

		for(int i=0; i<list; i++)
		{
			out.printf("Enter the number: ");

			int num = input.nextInt();

			if(num<0)
				neg++;
			else
				pos++;

		}

		out.printf("There were %d non-negetive numbers in the list\n", pos);

		out.printf("There were %d negetive numbers in the list\n", neg);
	}
}
