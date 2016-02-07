
public class CheckingAccount extends Account{
    
    public static int numberOfAccount=0;
    
    public CheckingAccount() {
        this(0.0);
    }
    
    public CheckingAccount(double amount) {
        super(amount);
        numberOfAccount++;
    }
    
}
