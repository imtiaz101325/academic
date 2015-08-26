/*1. Change the following java code so that the “amount” of money is 
split into 100, 50, 20, 10, 5, 2 and 1 taka bills or coins. The output
would be:
	3 1 1
	1 1 1 1
*/
import java.util.Scanner;
public class MoneySplit{

	public static void main(String[] args)
	{
		Scanner k = new Scanner(System.in);
		
	    int oneTaka = 0, twoTaka = 0, fiveTaka = 0, tenTaka = 0;
	    int twentyTaka = 0, fiftyTaka = 0, hundredTaka = 0;

	    System.out.println("dao");
	    int amount = k.nextInt();

	    hundredTaka = amount/100;
	    amount = amount%100;
	    fiftyTaka = amount/50;
	    amount = amount%50;
	    twentyTaka = amount/20;
	    amount = amount%20;
	    tenTaka = amount/10;
	    amount = amount%10;
	    fiveTaka = amount/5;
	    amount = amount%5;
	    twoTaka = amount/2;
	    amount = amount%2;
	    oneTaka = amount;

		System.out.println(hundredTaka + " " + fiftyTaka + " " + twentyTaka);
		System.out.println(tenTaka + " " + fiveTaka + " " + twoTaka + " " + oneTaka);
	}
}
  