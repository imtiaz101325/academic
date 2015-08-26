import java.util.Scanner;
public class arraysorting
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner (System.in);
        int [] numarray =new int[5];
        
        for(int count=0; count<numarray.length; count++)
        {
            System.out.println("Enter next element: ");
            numarray[count] = input.nextInt();
           
        }
        
        for(int i=0; i<numarray.length; i++)
        {
            for(int j=1; j<numarray.length-i; j++)
            {
                if(numarray[j-1] > numarray[j])
                {
                    int temp = numarray[j-1];
                    numarray[j] = numarray[j-1];
                    numarray[j] = temp;
                }
                
            }
        }
        
        for(int i=0; i<numarray.length; i++)
        {
           System.out.print(numarray[i] + " ");
        }
        for(int i=0; i<numarray.length; i++)
        {
           if(numarray[i]%2!=0)
           {
               System.out.print(numarray[i] + " ");
           }
        }
        
        }
}
