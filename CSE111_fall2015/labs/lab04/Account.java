//23/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 13:Design a “Account” class

public class Account {

	private String name;    
    private String accountNo;
    private String aaccountType;
    private double balance;
    
    public BankAccount() {
    }
    
    public BankAccount(String n, String a, String i, double c){
        
        name = n;
        accountNo = a;    
        accountType = i;
        balance = c;
    }
    
    public String getName() {
        
        return name;
    }
    public String getAccountNo() {
        
        return accountNo;
    }
    public String getAccountType(){
        
        return accountType;
    }
    public double getBalance(){
        
        return balance;
    }
    public void setName(String n) {
        
        name = n;
    }
    
    public void setAccountNo(String i){
        
        accountNo = i;
    }
    
    public void setAccountType(String a){
        
        accountType = a;
    }
    
    public void setBalance(double c){
        
        balance = c;
    }
}