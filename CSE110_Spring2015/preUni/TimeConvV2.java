import java.util.Scanner;
public class TimeConvV2
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);

		System.out.println("Please provide seconds:");

		int roughTime = in.nextInt();
		int hour      = roughTime/3600;
		int min       = (roughTime%3600)/60;
		int sec       = (roughTime%3600)%60;

		System.out.printf("The time is %d hours %d minutes %d seconds\n", hour, min, sec);
	}
}
