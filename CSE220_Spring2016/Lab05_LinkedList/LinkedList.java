public class LinkedList{
  public Node head;
  
  
  /* First Constructor:
   * Creates a linked list using the values from the given array. head will refer
   * to the Node that contains the element from a[0]
   */ 
  public LinkedList(Object [] a){

  	Node n = null;
  	for(int i=0; i<a.length; i++){

  		Node postNode = new Node(a[i], null);

  		if(i==0){

  			head = postNode;
  			n = head;
  		}else{

  			n.next = postNode;
  			n = n.next;
  		}
  	}
  }
  
  /* Second Constructor:
   * Sets the value of head. head will refer
   * to the given LinkedList
   */
  public LinkedList(Node h){
    
    head = h;
  }
  
  /* Counts the number of Nodes in the list */
  public int countNode(){
    int i=0;
    for(Node n=head; n != null; i++, n=n.next);

    return i;
  }
  
  /* prints the elements in the list */
  public void printList(){
    
    for(Node n = head; n != null;  n=n.next){

    	System.out.print(n.element+" ");
    }
    System.out.println();
  }
  
  // returns the reference of the Node at the given index. For invalid index return null.
  public Node nodeAt(int idx){

    if(idx < 0){

    	return null;
    }

    Node n = head;
    for(int i=0; n != null; i++, n=n.next){
    	if(i == idx){
    		return n;
    	}
    }

    return n;
  }
  
  
// returns the element of the Node at the given index. For invalid idx return null.
  public Object get(int idx){
    
    Node n = nodeAt(idx);

    if(n == null){

    	return null;
    }else{

    	return n.element;
    }
  }
  
  
  
  /* updates the element of the Node at the given index. 
   * Returns the old element that was replaced. For invalid index return null.
   * parameter: index, new element
   */
  public Object set(int idx, Object elem){
    
    Node n = nodeAt(idx);
    if(n == null){
    	return null;
    }
    Object back = n.element;
    n = new Node(elem, n.next);
    Node pred = nodeAt(idx -1);
    pred.next = n;

    return back;
  }
  
  
  /* returns the index of the Node containing the given element.
   if the element does not exist in the List, return -1.
   */
  public int indexOf(Object elem){

  	Node n = head;
  	for(int i=0; n != null; i++,n = n.next){

  		if(n.element.equals(elem)){
  			return i;
  		}
  	}

  	return -1;
  }
  
  // returns true if the element exists in the List, return false otherwise.
  public boolean contains(Object elem){
    Node n = head;
  	for(int i=0; n != null; n = n.next){

  		if(n.element.equals(elem)){
  			return true;
  		}
  	}

  	return false;
  }
  
  // Makes a duplicate copy of the given List. Returns the reference of the duplicate list.
  public Node copyList(){
    
    Node copyHead = new Node(head.element, null);
    Node copyTail = copyHead;

    for(Node n = head.next; n != null; n=n.next){

    	copyTail.next = new Node(n.element, null);
    	copyTail = copyTail.next;
    }

    return copyHead;
  }
  
  // Makes a reversed copy of the given List. Returns the head reference of the reversed list.
  public Node reverseList(){


    Node postNode = new Node(head.element, null);
    Node copyHead = postNode;

    for(Node n = head.next; n != null; n=n.next){

    	postNode = new Node(n.element, null);
    	postNode.next = copyHead;
    	copyHead = postNode; 

    }

    return copyHead;
  }
  
  /* inserts Node containing the given element at the given index
   * Check validity of index.
   */
  public void insert(Object elem, int idx){
    
    if(idx == 0){

    	Node postNode = new Node(elem, head);
    	head = postNode;
    }else{
		Node pred = nodeAt(idx-1);
		Node postNode = new Node(elem, pred.next);
		pred.next = postNode;
	}
  }
  
  
  /* removes Node at the given index. returns element of the removed node.
   * Check validity of index. return null if index is invalid.
   */
  public Object remove(int index){
    
    if(index == 0){

    	Object elem = head.element;
    	head = head.next;
    	return elem;

    }else{

		Node pred = nodeAt(index-1);
	    Object elem = pred.next.element;
	    pred.next = pred.next.next;
	    return elem;
	}
  }
  
  // Rotates the list to the left by 1 position.
  public void rotateLeft(){
    
    Node tail = null;
    for(Node n = head; n != null; n=n.next){
    	tail = n;
    }

    tail.next = head;
	head = head.next;
	tail.next.next = null;
  }
  
  // Rotates the list to the right by 1 position.
  public void rotateRight(){
    
  	Node preTail = null;
  	Node tail = head;
    for(;tail.next != null; tail=tail.next){
    	preTail = tail;
    }
	
	tail.next = head;
	head = tail;
	preTail.next = null;
  }
  
}