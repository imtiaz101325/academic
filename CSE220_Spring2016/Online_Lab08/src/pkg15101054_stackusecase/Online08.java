
package pkg15101054_stackusecase;

import java.util.Scanner;
public class Online08 {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        ArrayStack a = new ArrayStack();
        ListStack l = new ListStack();
       
        System.out.print("Enter expression: ");
        
        String userIn = input.nextLine();
        
        for(int i=0; i<userIn.length(); i++){
            
            char each = userIn.charAt(i);
            
            if(each == '(' || each == '{' || each == '['){
                try {
                    a.push(each);
                } catch (StackOverflowException e) {
                    
                    System.out.println("Increase array size :@");
                }
                
            }
            
            if(each == ')' || each == '}' || each == ']'){
                
                Object keep = null;
                
                try {
                    keep = a.pop();
                } catch (StackUnderflowException e) {
                    
                    System.out.println("Closing parenthesis mismatch!");
                    break;
                }                
                
                if(keep.equals('(') && each == ')' || keep.equals('{') && each == '}' || keep.equals('[') && each == ']'){
                    
                    System.out.println("Statement is correct");
                }else{
                    
                    System.out.println("Pair does not match!");
                }
            }
        }
        
        if(!a.isEmpty()){
            
            System.out.println("Opening parenthesis mismatch");
        }
       
        
    }
    
}
