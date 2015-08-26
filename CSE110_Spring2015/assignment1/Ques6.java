import static java.lang.System.*;
import java.util.*;

public class Ques6
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter a number: ");

		int num = input.nextInt();

		if( num < 0 )
			num = num*-1;

		out.printf("The absolute value of the given number is: %d\n", num);
	}
}
