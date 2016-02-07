public class Main{

    public static void main(String[] args) {
        

       
//        BankAccount acc1 = new BankAccount();
//        BankAccount acc2 = new BankAccount();
//        BankAccount acc3 = new BankAccount();
//        
//        acc1.setName("Jim");
//        acc1.setAccountID("1231");
//        acc1.setAddress("B Street");
//        acc1.setBalance(10000);
//        
//        acc2.setName("Joe");
//        acc2.setAccountID("1256");
//        acc2.setAddress("C Street");
//        acc2.setBalance(40928);
//        
//        acc3.setName("Mike");
//        acc3.setAccountID("1268");
//        acc3.setAddress("A Street");
//        acc3.setBalance(20000);
        
        BankAccount acc1 = new BankAccount("Jim", "1231", "B Street", 10000);
        BankAccount acc2 = new BankAccount("Joe", "1256", "C Street", 40928);
        BankAccount acc3 = new BankAccount("Mike", "1268", "A Street", 20000);
                
        acc1.addInterest();
        acc3.addInterest();
        
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