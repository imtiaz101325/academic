//bubble sort
//ascending 
import static java.lang.System.*;
import java.util.*;

public class BubSort
{
    public static void main(String[] args)
    {
        int[] hold = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        
        for(int i=0; i<hold.length; i++)
        {
            for(int j=1; j<hold.length-i; j++)
            {
                if(hold[j-1]>hold[j])
                {
                    int temp = hold[j-1];
                    hold[j-1] = hold[j];
                    hold[j] = temp;
                }
            }
        }
        
        out.print("[ ");
        for(int each: hold)
        {
            out.print(each+" ");
        }
        out.println("]");
    }
}