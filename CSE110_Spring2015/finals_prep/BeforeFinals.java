public class BeforeFinals
{
    public void fibs(int n)
    {
        int a = 0;
        int b = 1;
        
        for(int i=2; i<n; i+=2)
        {
            System.out.print(a+" ");
            System.out.print(b+" ");
            a = a+b;
            b = a+b;
        }
        
        if(n%2==0)
        {
            System.out.print(a+" ");
            System.out.println(b+" ");
        }
        else
            System.out.println(a+" ");
        
        
    }
    
    public void ssort(int[] ara)
    {
        int min,pos;
        
        for(int i=0; i<ara.length; i++)
        {
            min = ara[i];
            pos = i;
            
            for(int j=i; j<ara.length; j++)
            {
                if(ara[j]<min)
                {
                    min = ara[j];
                    pos = j;
                }
            }
            
            int temp = ara[i];
            ara[i] = min;
            ara[pos] = temp;
        }
    }
    
    public void bsort(int ara[])
    {
        for(int i=0; i<ara.length; i++)
        {
            for(int j=1; j<ara.length-i; j++)
            {
                if(ara[j-1]>ara[j])
                {
                    int temp = ara[j-1];
                    ara[j-1] = ara[j];
                    ara[j] = temp;
                }
            }
        }
    }
    
    public void maxmin(int[] ara)
    {
        int max = ara[1];//arbitrary
        int min = ara[0];
        int maxPos = 1;
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
        
        System.out.println("Maximum is "+max+" found in position "+maxPos);
        System.out.println("Minimum is "+min+" found in position "+minPos);
    }
    
    public void primes(int n)
    {
        for(int i=1; i<=n; i++)
        {   
            int bucket = 0;
            for(int j=1; j<i; j++)
            {
                if(i%j==0)
                {
                    bucket += j;
                }
            }
            
            if(bucket == 1)
            {
                System.out.print(i+" ");
            }
        }
    }
    
    public void perfect(int n)
    {
        for(int i=1; i<=n; i++)
        {   
            int bucket = 0;
            for(int j=1; j<i; j++)
            {
                if(i%j==0)
                {
                    bucket += j;
                }
            }
            
            if(bucket == i)
            {
                System.out.print(i+" ");
            }
        }
    }
}