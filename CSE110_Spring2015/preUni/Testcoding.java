import static java.lang.System.*;
import java.util.*;

public class Testcoding
{
	public static void main(String[] args)
	{
		int[] ara = {1, 2, 3, 4};

		int[] b = ara;

		out.printf("%5s%8s\n", "ara", "b");

		for(int i=0; i< ara.length; i++)
		{	
			out.printf("%5d%8d\n", ara[i], b[i]);
		}
	}
}
