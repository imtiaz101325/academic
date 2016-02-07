import java.util.Scanner;

public class Rotate{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
       //given array
       int[] t9a1 = {1,4,8,16,25,36,49,64,81,100};
       
       //copp whole array
       int[] t9a2 = new int[t9a1.length];
       
       for(int i=0; i<t9a2.length; i++) {
           
           t9a2[i] = t9a1[i];
       }      
        
       
       System.out.print("Ehter the number of positons to rotate: ");
       int pos = input.nextInt();
       
       //rotating left
       int[] coppy1 = new int[pos];
       for(int i=0; i<coppy1.length; i++){
           
           coppy1[i] = t9a1[i];
       }
       
       for(int i=0; i<t9a1.length - pos; i++){
           
           t9a1[i] = t9a1[i+pos];
       }
       
       for(int i=t9a1.length-1, j = coppy1.length-1; j>=0; i--, j--){
           
           t9a1[i] = coppy1[j];
       }
       
       
       //rotating right
       int[] coppy2 = new int[pos];
       
       for(int i = t9a2.length-1, j = coppy2.length-1; j>=0; i--,j--) {
           
           coppy2[j] = t9a2[i];
       }
       
       for(int i=t9a2.length-1; i>=t9a2.length-1-pos-1; i--){
           
           t9a2[i] = t9a2[i-pos];
       }
       
       for(int i=0; i<coppy2.length;i++){
           
           t9a2[i] = coppy2[i];
       }
       
       for(int i=0; i<t9a1.length; i++){
           System.out.print(t9a1[i]+" ");
       }
       System.out.println();
       
       for(int i=0; i<t9a2.length; i++){
           System.out.print(t9a2[i]+" ");
       }
       System.out.println();
	}
}