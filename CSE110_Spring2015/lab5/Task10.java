//Sk. Imtiaz Ahmed
//March 27, 2015
//Lab task for Md. Shamsul Kaonain CSE110
//Task 10: Write a Java program which adds all numbers that are multiples of 
//both 7 and 9 up to 600

import static java.lang.System.*;
import java.util.*;

public class Task10
{
	public static void main(String[] args)
	{		
		int sum = 0;//holds the sum of numbers

		for(int i=1; i<=600; i++)//generates numbers upto 600
		{
			if(i%7==0)
				if(i%9==0)
					sum+=i;//adds to sum if multiple of both 7 and 9
					
		}

		out.println(sum);//output

	}
}
