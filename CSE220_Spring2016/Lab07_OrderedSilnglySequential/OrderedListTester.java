
public class OrderedListTester {

    
    public static void main(String[] args) {
       
        MyOrderList m = new MyOrderList();
        
        m.showList();
        
        //instering into empty list
        m.insert(new Node(20));
        
        m.showList();
        
        //inseting after first element
        m.insert(new Node(40));
        
        m.showList();
        
        //inserting at the first position
        m.insert(new Node(10));
        
        m.showList();
        
        //inserting in between
        m.insert(new Node(30));
        
        m.showList();

        //inserting in end
        m.insert(new Node(50));
        
        m.showList();
                
        System.out.println("Searching for existing: "+m.retrieve(50).elem);

        System.out.println("Searching for non-exsisting: "+m.retrieve(98765));

        System.out.println("Removing : "+m.remove().elem);


    }
    
}
