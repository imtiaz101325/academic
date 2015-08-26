//sorting
//ascending
import static java.lang.System.*;
import java.util.*;

public class Sort
{
    public static void main(String[] args)
    {
        int[] hold = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        int min, pos;
        
        for(int i=1; i<hold.length; i++)
        {
            min = hold[i-1];
            pos = i-1;
            
            for(int j=i; j<hold.length; j++)
            {
                if(hold[j]<min)
                {
                    min = hold[j];
                    pos = j;
                }
            }
            
            hold[pos] = hold[i-1];
            hold[i-1] = min;
        }
        
        out.print("[ ");
        for(int each: hold)
        {
            out.print(each+" ");
        }
        out.println("]");
        
    }
}
            
            