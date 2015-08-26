//Algorithm 2.6:Generating Fibonacchi numbers
//Reference:How to solve it by computer; R. G. Dromey
//Author:Sk. Imtiaz Ahmed
//8 February 2015

import static java.lang.System.*;
import java.util.*;

public class Fibonacchi
{
	public static void main(String[] args)
	{
		
		Scanner input = new Scanner(System.in);
		out.println("Enter n where upto nth fibonacchi number will be generated:");
		int fib          = input.nextInt();
		int formerSigFib = 0;
		int latterSigFib = 1;
		
		for(int i=2;i<fib;i=i+2)
		{
			out.printf("%d, ",formerSigFib);
			out.printf("%d, ",latterSigFib);
			
			formerSigFib = formerSigFib+latterSigFib;
			latterSigFib = formerSigFib+latterSigFib;
		}

		if(fib%2==0)
		{
			out.printf("%d, ",formerSigFib);
			out.printf("%d\n",latterSigFib);
		}
		else
			out.printf("%d\n",latterSigFib);
	}
	
}

