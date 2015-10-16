//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 12:Design a “SavingsAccount” class

public class SavingsAccount{
    
    public static double annualInterestRate;
    private double savingsBalance;
    
    public SavingsAccount() {
    }
    
    public SavingsAccount(double c) {
        
        savingsBalance = c;
    }
    
    public void calculateMonthlyInterest() {
        
        savingsBalance += savingsBalance*annualInterestRate/12;
    }
    
    public static void modifyInterestRate( double i ) {
        
        annualInterestRate = i;
    }
    
    public void printSavingsBalance() {
        
        System.out.println(savingsBalance);
    }
}