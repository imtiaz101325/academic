import java.util.Scanner;

public class Task04{

    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
        
       System.out.println("Enter the dimentions of the row matrices.");
       int dim = input.nextInt();
       
       int[] t8A1 = new int[dim];
       
       System.out.println("Reading matrix A inputs: ");
       
       for(int i =0; i<t8A1.length; i++) {
           
           System.out.print("A"+(i+1)+" : ");
           t8A1[i] = input.nextInt();
           
       }
       
       int[] t8A2 = new int[dim];
       
       System.out.println("Reading matrix B inputs: ");
       
       for(int i =0; i<t8A2.length; i++) {
           
           System.out.print("B"+(i+1)+" : ");
           t8A2[i] = input.nextInt();
           
       }
               
       task4(t8A1, t8A2);

   }

static void task4(int[] ara1, int[] ara2) {
        
        int[] ans = new int[ara1.length];
        
        System.out.println("Calculating summation...");
        
        for(int i=0; i<ara1.length; i++){
            
            ans[i] = (5*ara1[i]-ara2[i]);
        }
        
        System.out.println("Printing out the summation...");
        System.out.print("[");
        for(int i=0; i<ans.length; i++) {
            
            if(i != ans.length-1){
                
                System.out.print(ans[i]+" ");
            }else {
                System.out.print(ans[i]);
            }
        }
        System.out.println("]");
    }
  }

    