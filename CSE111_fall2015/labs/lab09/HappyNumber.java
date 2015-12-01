import static java.lang.System.*;
import java.util.*;

public class HappyNumber{

	Scanner input = new Scanner(in);

	public static int powerCount(int num) {

		int pow = -1;

		for(;num > 0; num/=10){
			pow++;
		}

		return pow;
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(in);

		int len = input.nextInt();
		for(int i=0; i<len; i++) {

			// out.print("Enter: ");
			// out.println(powerCount(input.nextInt()));

			int num = input.nextInt();
			int caseHold = num;
			int pow = powerCount(num);

			if(pow == 0) {

				num*=num;
				pow = powerCount(num);
			}

			int hold = 0;
			while(pow > 0){

				hold = 0;
				for(int tempPow = pow; num > 0; tempPow--) {

					int temp = (int)(Math.pow(10,tempPow));
					
					hold += ((int)(Math.pow((num/temp), 2)));
					num%=temp;
				}

				pow = powerCount(hold);
				num = hold;
			}

			if(hold == 1) {

				out.println("Case #"+(i+1)+": "+caseHold+" Happy number.");
			}else {

				out.println("Case #"+(i+1)+": "+caseHold+" Unhappy number.");
			}
		}
	}
}