//23/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 13:Design a “Account” class

public class SavingsAccount2 extends Account {

	public SavingsAccount2() {

	}

	public SavingsAccount2(String n, String a,  String i, double c) {

		super( n,  a,  i, c);
	}

	public void depAmount(double deposit) {

        setBalance(getBalance() + deposit);
    }

    public void showBalance() {

    	System.out.println("Balance is $"getBalance());
    }

    public void computeInterest() {

    	setBalance(getBalance()+(getBalance()*.05));
    }

    public void withdraw(double ammount) {

    	setBalance(getBalance() - ammount);
    }
}