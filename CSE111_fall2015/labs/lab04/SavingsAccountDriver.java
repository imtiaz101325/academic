//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 11:Design a “BankAccount” class
//Driver class

public class SavingsAccountDriver {
 
    public static void main(String[] args) {
        
        SavingsAccount saver1 = new SavingsAccount(20000.00);
        
        SavingsAccount saver2 = new SavingsAccount(30000.00);
        
        SavingsAccount.modifyInterestRate(4.2);
        
        saver1.calculateMonthlyInterest();
        
        saver2.calculateMonthlyInterest();
        
        saver1.printSavingsBalance();
        
        saver2.printSavingsBalance();
        
        SavingsAccount.modifyInterestRate(5.5);
        
        saver1.calculateMonthlyInterest();
        
        saver2.calculateMonthlyInterest();
        
        saver1.printSavingsBalance();
        
        saver2.printSavingsBalance();
    }
}