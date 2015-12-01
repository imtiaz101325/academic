//23/10/15
//Sk. Imtiaz Ahmed
//CSE111 lab tasks for Tamal Adhikary BRAC University
//Lab04
//Task 13:Design a “Account” class

public class CurrentAccount extends Account {

	private boolean canWithdraw;

	public CurrentAccount() {

		canWithdraw = true;
	}

	public CurrentAccount(String n, String a,  String i, double c) {

		super( n,  a,  i, c);

		if(c < 500.00){

			canWithdraw = false;
		}else {

			canWithdraw = true;
		}
		
	}

	public void depAmount(double deposit) {

        setBalance(getBalance() + deposit);
    }

    public void showBalance() {

    	System.out.println("Balance is $"getBalance());
    }

    public void computeInterest() {

    	System.out.println("No interest for current account.");
    }

    public void withdraw(double ammount) {

    	if(canWithdraw) {

    		setBalance(getBalance() - ammount);	
    	}else {

    		System.out.println("Please wait!");
    		checkStatus();
    	}
    }

    public checkStatus() {

    	if(getBalance() < 500.00) {

    		System.out.println("Your account balance is less than required!");
    		canWithdraw = false;
    		System.out.println("You may not withdraw money unless your balance exceeds $500.");
    	}else {

    		System.out.println("You may proceed to withdraw again. Sorry for the inconvenience.");
    	}
    }
}