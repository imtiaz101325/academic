//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 10:Design a “BankAccount” class
//Tester class

public class MainBankAccount {
    
    public static void main(String[] args){
        
        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();
        
        acc1.setName("John Cena");
        acc1.setAccountID("126423");
        acc1.setAddress("34, Manhatten, Murica");
        acc1.setBalance(2301);
        
        acc2.setName("Mike Tyson");
        acc2.setAccountID("152375");
        acc2.setAddress("35, Manhatten, Murica");
        acc2.setBalance(22315);
        
        acc3.setName("Carol Lewis");
        acc3.setAccountID("124565");
        acc3.setAddress("22, Manhatten, Murica");
        acc3.setBalance(35345.5);
        
        acc1.addInterest();
        acc2.addInterest();
        
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getBalance());
        
        System.out.println(acc2.getName());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getBalance());
        
        System.out.println(acc3.getName());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getBalance());
        
        
    }
    
}