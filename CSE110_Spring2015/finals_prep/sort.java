public class sort
{
    public static void main(String[] args)
    {
        int[] ara = {9,8,7,6,5,4,3,2,1};
        
        int min, pos;
        
        for(int i=1; i<ara.length; i++)//sort loop
        { 
            min = ara[i-1];
            pos = i-1;
            
            for(int j=i; j<ara.length; j++)//selection loop
            {
                if(ara[j]<min)//comarison
                {
                    //save element and position
                    min = ara[j];
                    pos = j;
                }
            }
            
            //swap block
            ara[pos] = ara[i-1];
            ara[i-1] = min;
            
        }
        
        //print array
        System.out.print("[ ");
        for(int each: ara)
        {
            System.out.print(each+" ");
        }
        System.out.println("]");
        
    }
}