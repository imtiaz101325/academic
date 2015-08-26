//selection sort
//descending

import static java.lang.System.*;
import java.util.*;

public class SelSort
{
    public static void main(String[] args)
    {
        int[] hold = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        int max, pos;
        
        for( int i=1; i<hold.length; i++)
        {
            max = hold[i-1];
            pos = i-1;
            
            for(int j=i; j<hold.length; j++)
            {
                if(hold[j]>max)
                {
                    max = hold[j];
                    pos = j;
                }
            }
            
            hold[pos] = hold[i-1];
            hold[i-1] = max;
        }
        
        out.print("[ ");
        for(int each: hold)
        {
            out.print(each+" ");
        }
        out.println("]");
    }
    
}