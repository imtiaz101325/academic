import static java.lang.System.*;
import java.util.*;

public class Conv
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        String[] numbers = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine"};
        
        out.print("Enter your nubmer: ");
        int num = input.nextInt();

        if(num<0)
        {
            out.print("minus ");
            num *= -1;
        }
        
        int temp = num;
        int pow = 1;
        while(temp>10)
        {
            temp /= 10;
            pow *= 10;
        }
        
        while(num>0)
        {
            out.print(numbers[num/pow]+ " ");
            num = num%pow;
            pow /= 10;
        }
        out.println();
    }
}