import static java.lang.System.*;
import java.util.*;

public class CodeForBhowmik
{
	public static void main( String[] args )
	{
		Scanner input = new Scanner(in);

		int[] ara = {1, 2, 3, 4, 5};

		for(int i=0; i<ara.length; i++)
		{
			for(int j = 1; j<ara.length-i; j++)
			{
				if(ara[j-1]<ara[j])
				{
					int temp = ara[j-1];
					ara[j-1] = ara[j];
					ara[j] = temp;
				}
			}
		}

		for(int i=0; i<ara.length; i++)
		{
			out.print(ara[i]+ " ");
		}
		out.println();
	}
}
