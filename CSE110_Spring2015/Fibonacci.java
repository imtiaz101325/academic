//a programm to print the fibonacci series upto n

public class Fibonacci
    
{
    public void fibonacci(int n)
    
    {
        //first to fibs
        int a=0;
        int b=1;
        
        for(int i=2; i<n; i+=2)//loop up to n
        {
            //print last to fibs
            System.out.print(a+", ");
            System.out.print(b+", ");

            //add to generate next fibs
            a = a+b;
            b = a+b;
        }
        

        if(n%2==0)//if even print the last two
        {
            System.out.print(a+", ");
            System.out.print(b);
        }
        else//only the first one for odd
        {
            System.out.print(a);
        }
        System.out.println();
        
    }
}