//bubble sort
//descending 
import static java.lang.System.*;
import java.util.*;

public class BubSort2
{
    public static void main(String[] args)
    {
        int[] hold = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        
        for(int i=0; i<hold.length; i++)
        {
            for(int j=1; j<hold.length-i; j++)
            {
                if(hold[j-1]<hold[j])
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