import java.util.Scanner; 
public class a1 
{ 
    public static void main(String[]args) 
    { 
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Please enter a number"); 
        int x = sc.nextInt();
        if(x<0){
            System.out.print("minus ");
            x *= -1;
        }
        int a = x;
        int c =0;
        while(x>0)
        { 
            x=x/10; 
            c= c+1; 
        }
        c= c-1;
        
        for(int m=c;m>=0;m--) 
        {  double s=Math.pow(10,m); 
            int j = (int)s; 
            int d =a/j; 
            a=a%j; 
            switch(d){ 
                case 0: System.out.print("zero "); 
                break; 
                case 1: System.out.print("one "); 
                break; 
                case 2: System.out.print("two "); 
                break; 
                case 3: System.out.print("three "); 
                break; 
                case 4: System.out.print("four "); 
                break; 
                case 5: System.out.print("five "); 
                break; 
                case 6: System.out.print("six "); 
                break; 
                case 7: System.out.print("seven "); 
                break; 
                case 8: System.out.print("eight "); 
                break; 
                case 9: System.out.print("nine "); 
                break; 
            } 
        } 
        System.out.println();
    } 
}