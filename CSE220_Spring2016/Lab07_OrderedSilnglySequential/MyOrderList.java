public class MyOrderList {
    
    
    public Node cursor;
    
    public MyOrderList(){
        
        cursor = null;
    }
    
    public void insert (Node newElement){
        
        if(cursor == null){
            
            cursor = newElement;
            cursor.next = cursor;
            
        }else if(cursor.next == cursor){
            
            cursor.next = newElement;
            newElement.next = cursor;
        }else{
            
            Node keep = cursor;

            Node tail = gotoEnd();
            Node head = tail.next;

            cursor = keep;
            
            if(head.elem > newElement.elem || tail.elem < newElement.elem){
                
                tail.next = newElement;
                newElement.next = head;

            }else{
                for(Node n = head; n.next != head; n = n.next){
                
                    if(n.elem < newElement.elem && n.next.elem > newElement.elem){
                        
                        newElement.next = n.next;
                        n.next = newElement;
                    }
                }
                
            }            
        }
    }
    
    public Node retrieve(int searchKey){
        
        if(cursor == null){
            
            return null;
            
        }else if(cursor.next == cursor){
            
            if(cursor.elem == searchKey){
                return cursor;
            }
            
            return null;
            
        }else{

            Node keep = cursor;

            Node head = gotoBeginning();

            Node n = head;
            for(; n.next != head; n = n.next){

                if(n.elem == searchKey){
                    
                    cursor = n;
                    return cursor;
                }
            }
            
            if(n.elem == searchKey){
                cursor = n;
                return cursor;
            }
            
            return null;
        }
    }

    public Node remove(){

        Node keep = cursor;

        if(cursor == null){
            
            return null;
            
        }else if(cursor.next == cursor){
            
            cursor = null;

            return keep;
            
        }else{

            Node pred = gotoPrior();

            cursor = keep.next;
            pred.next = cursor;

            return keep;
        }
    }
    
    public Node remove(int deleteKey){

        Node keep = cursor;

        if(cursor == null){
            
            return null;
            
        }else if(cursor.next == cursor){
            
            if(cursor.elem == deleteKey){
                
                cursor = null;

                return keep;
            }
            
            return null;
            
        }else{

            Node head = gotoBeginning();

            Node n = head;
            for(; n.next != head; n = n.next){

                if(n.elem == deleteKey){
                    
                    cursor = n;
                    cursor = gotoPrior();
                    cursor.next = cursor.next.next;

                    cursor = cursor.next;

                    return keep;
                }
            }
            
            if(n.elem == deleteKey){

                cursor = n;
                cursor = gotoPrior();
                cursor.next = cursor.next.next;

                cursor = cursor.next;

                return keep;
            }
            
            cursor = keep;
            return null;
        }
    }    
    
    public void clear(){

        if(cursor == null){
            
        }else if(cursor.next == cursor){
            
            cursor.elem = -1;
            cursor.next = null;

        }else{

            Node head = gotoBeginning();

            Node n = head;
            for(; n.next != head;){

                cursor = n;
                n = n.next;
                cursor.elem = -1;
                cursor.next = null;
            }

            n.elem = -1;
            n.next = null;
        }
    }
    
    public boolean isEmpty(){
        
        if(cursor == null){
            
            return true;
        }
        
        return false;
    }

    public Node gotoBeginning(){
        
        if(cursor != null){
            Node n=cursor;
            for(; n.elem < n.next.elem; n = n.next);
            
            cursor = n.next;
        }

     return cursor;
    }

    public Node gotoEnd(){
        
        if(cursor != null){
            Node n=cursor;
            for(; n.elem < n.next.elem; n = n.next);
            
            cursor = n;

        }

     return cursor;
    }
    
    public Node gotoNext(){
        
        if(cursor != null){
            
            cursor = cursor.next;
            
        }
        
        return cursor;
    }
    
    public Node gotoPrior(){

        Node keep = cursor;
        
        Node tail = gotoEnd();
        Node head = tail.next;
        
        if(head == keep){
            
            return tail;
        }else{
            
            Node n = head;
            for(; n.next != head; n = n.next){

                if(n.next == head){

                    cursor = n;
                    return n;
                }
            }

            cursor = keep;
            return cursor;
        }
    }

    public Node getCursor(){
        
        return cursor;
    }
    
    public void showList(){
        
        if(cursor == null){
            
            System.out.println("Empty List");
            
        }else if(cursor.next == cursor){
            
            System.out.println(cursor.elem);
            
        }else{

            Node head = gotoBeginning();

            Node n = head;
            for(; n.next != head; n = n.next){

                System.out.print(n.elem+" ");
            }
            System.out.println(n.elem);
        }
    }
}
