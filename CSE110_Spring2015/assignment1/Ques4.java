import static java.lang.System.*;
import java.util.*;

public class Ques4
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(in);

		out.printf("Enter the value of the first variable: ");

		int var1 = input.nextInt();

		out.printf("Enter the value of the second variable: ");

		int var2 = input.nextInt();

		out.printf("Enter the value of the third variable: ");

		int var3 = input.nextInt();

		var1 = var1+var2+var3;
		var2 = var1-var2-var3;
		var3 = var1-var2-var3;
		var1 = var1-var2-var3;

		out.printf("The first variable is now: %d\n", var1);
		out.printf("The second variable is now: %d\n", var2);
		out.printf("The third variable is now: %d\n", var3);
	
	}

}
