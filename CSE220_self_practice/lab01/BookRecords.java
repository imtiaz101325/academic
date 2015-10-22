//19/10/2015
//Sk. Imtiaz Ahmed || @excalliburbd
//Self practice for CSE220: Datastructure

public class BookRecords {
    
    private Book[] bookArray;
    
    public BookRecords() {
        
        bookArray = new Book[1];
    }
    
    public void addRecord(String n, String id, String a, String p) {
        
        int emptyIndex = bookArray.length-1;
        boolean hasEmpty = false;
        
        for(int i=0; i<bookArray.length; i++) {
            
            if(bookArray[i] == null) {
                
                emptyIndex = i;
                hasEmpty = true;
                break;
            }
        }
        
        if(!hasEmpty) {
            
            Book[] newBookArray = new Book[bookArray.length+1];
            
            for(int i=0; i<bookArray.length; i++) {
                
                newBookArray[i] = bookArray[i];
            }
            
            bookArray = newBookArray;
            
            emptyIndex = bookArray.length-1;
        }
        
        bookArray[emptyIndex] = new Book(n, id, a, p);
        
    }
    
    public void printRecord() {
        
        boolean idSort = false;
        
        for(int i=bookArray.length; i>=0; i--) {
            for(int j=1; j<i; j++) {
                
                int compare = bookArray[j-1].getName().compareTo(bookArray[j].getName());
                
                if(compare > 0) {
                    
                    Book temp = bookArray[j-1];
                    bookArray[j-1] = bookArray[j];
                    bookArray[j] = temp;
                }else if(compare == 0) {
                    
                    idSort = true;
                    break;
                }
            }
        }
        
        if(idSort) {
            
            for(int i=bookArray.length; i>=0; i--) {
                for(int j=1; j<i; j++) {
                    
                    int compare = bookArray[j-1].getID().compareTo(bookArray[j].getID());
                    
                    if(compare > 0) {
                        
                        Book temp = bookArray[j-1];
                        bookArray[j-1] = bookArray[j];
                        bookArray[j] = temp;
                    }
                }
            }
        }
        
        for(int i=0; i<bookArray.length; i++) {
            
            System.out.println("Entry #"+(i+1));
            System.out.println(bookArray[i].getName());
            System.out.println(bookArray[i].getID());
            System.out.println(bookArray[i].getAuthor());
            System.out.println(bookArray[i].getPublisher());
        }
    }
    
    public void deleteRecord(String id) {
        
        int bookIndex =0;
        boolean indexFound = false;
        
        for(int i=0; i<bookArray.length; i++) {
            
            if(bookArray[i].getID().equals(id)) {
                
                bookIndex = i;
                indexFound = true;
            }
        }
        
        if(indexFound) {
            
            Book[] newBookArray = new Book[bookArray.length-1];
            
            for(int i=0; i<newBookArray.length; i++) {
                
                if(i == bookIndex) {
                    i++;
                }
                newBookArray[i] = bookArray[i];
            }
            
            System.out.println("ID# "+id+" is deleted!");
            
            bookArray = newBookArray;
        }else {
            
            System.out.println("Record does not exist!");
        }
    }

    public Book editRecord(String id) {

    	boolean hasID = false;
    	int bookIndex = -21;
    	Book book;

    	for(int i=0; i<bookArray.length; i++) {

    		if(bookArray[i].getID().equals(id)) {

    			hasID = true;
    			bookIndex = i;
    			break;
    		}
    	}

    	if(hasID) {

    		book = bookArray[bookIndex];
    	}else {

    		book = null;
    	}

    	return book;
    }
}
