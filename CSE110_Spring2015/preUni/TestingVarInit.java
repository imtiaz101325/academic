import java.util.*;

public class TestingVarInit
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();

		int buffer;

		buffer = a;
		a      = b;
		b      = c;
		c      = buffer;

		System.out.printf("%d, %d, %d\n", a, b, c);
	}
}	
