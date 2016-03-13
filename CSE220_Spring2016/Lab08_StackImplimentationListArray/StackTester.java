public class StackTester {
    public static void main(String[] args) {
        
        System.out.println("----------------------------------ArrayStack---------------------------");
        
        ArrayStack a = new ArrayStack();
        
        try{
            
            System.out.println("Size: "+a.size());
            a.push(100);
            a.push(90);
            a.push(80);
            a.push(70);
            System.out.println("Peeked: "+a.peek());
            a.push(80);
            System.out.println("Size: "+a.size());
            System.out.println("Stack: "+a.toString());
            
            System.out.println("Poped: "+a.pop());
            System.out.println("Stack: "+a.toString());
            
            System.out.println("Search 90: "+a.search(90));
            System.out.println("Stack: "+a.toString());
        }catch(Exception e){
            
            System.out.println(e);
        }
        
        
        System.out.println("----------------------------------ListStack---------------------------");
        
        ListStack l = new ListStack();
        
        try{
            
            System.out.println("Size: "+l.size());
            l.push(100);
            l.push(90);
            l.push(80);
            l.push(70);
            System.out.println("Peeked: "+l.peek());
            l.push(80);
            System.out.println("Size: "+l.size());
            System.out.println("Stack: "+l.toString());
            
            System.out.println("Poped: "+l.pop());
            System.out.println("Stack: "+l.toString());
            
            System.out.println("Search 90: "+l.search(90));
            System.out.println("Stack: "+l.toString());
        }catch(Exception e){
            
            System.out.println(e);
        }
    }
    
}
