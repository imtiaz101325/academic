import java.util.Scanner;
public class TimeConv
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Please provide seconds:");
		
		int roughTime = in.nextInt();
		int hour      = roughTime/3600;
		int min       = ((roughTime-(hour*3600))/60);
		int sec       = roughTime-(hour*3600)-(min*60);

		System.out.printf("The time is %d hours %d min %d sec\n", hour, min, sec);

	}
}
