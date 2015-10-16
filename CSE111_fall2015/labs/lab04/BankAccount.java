//14/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 11:Design a “BankAccount” class

public class BankAccount {
    
    private String name;
    private String address;    
    private String accountID;
    private double balance;
    
    public BankAccount() {
    }
    
    public BankAccount(String n, String a, String i, double c){
        
        name = n;
        address = a;    
        accountID = i;
        balance = c;
    }
    
    public String getName() {
        
        return name;
    }
    public String getAccountID() {
        
        return accountID;
    }
    public String getAddress(){
        
        return address;
    }
    public double getBalance(){
        
        return balance;
    }
    public void setName(String n) {
        
        name = n;
    }
    
    public void setAccountID(String i){
        
        accountID = i;
    }
    
    public void setAddress(String a){
        
        address = a;
    }
    
    public void setBalance(double c){
        
        balance = c;
    }
    
    public void addInterest() {
        
        balance = balance + (balance*.07);//adds 7% interest
    }
}