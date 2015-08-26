import static java.lang.System.*;
import java.util.*;

public class CodeForRahat
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        
        int[] ara = new int[5];
        
        for(int i=0; i<ara.length; i++)
        {
            out.print("Enter next element: ");
            ara[i] = input.nextInt();
        }
        
        int max = ara[4];//arbitrary
        int min = ara[0];
        int maxPos = 4;
        int minPos = 0;
        
        for(int i=0; i<ara.length; i++)
        {
            if(ara[i]>max)
            {
                max = ara[i];
                maxPos = i;
            }
            
            if(ara[i]<min)
            {
                min = ara[i];
                minPos = i;
            }
        }
        
        out.println("Maximum is "+max+" found in position "+maxPos);
        out.println("Minimum is "+min+" found in position "+minPos);
    }
}