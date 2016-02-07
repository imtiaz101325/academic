public class CircularArray{
  
  private int start;
  private int size;
  private Object [] cir;
  
  /*
   * if Object [] lin = {10, 20, 30, 40, null}
   * then, CircularArray(lin, 2, 4) will generate
   * Object [] cir = {40, null, 10, 20, 30}
   */
  public CircularArray(Object [] lin, int st, int sz){
    start = st;
    size = sz;
    cir = new Object[lin.length];
    for(int i=0; i<size; i++,st = ((st+1)%cir.length)){

    	cir[st] = lin[i];
    }
  }
  
  //Prints from index --> 0 to cir.length-1
  public void printFullLinear(){
        
        for(int i=0; i<cir.length; i++){

        	if(i != cir.length-1){

        		System.out.print(cir[i]+", ");
        	}else{

        		System.out.println(cir[i]+".");
        	}
        }
    }  
  // Starts Printing from index start. Prints a total of size elements
  public void printForward(){
    
    for(int i=0, j=start; i<size; i++, j = ((j+1)%cir.length)){

    	if(i != size-1){

    		System.out.print(cir[j]+", ");
    	}else{

    		System.out.println(cir[j]+".");
    	}

    }
  }
  
  
  public void printBackward(){
   	
   	for(int i=0, j=((start+size-1)%cir.length); i<size; i++){

   		if(i != size-1){

    		System.out.print(cir[j]+", ");
    	}else{

    		System.out.println(cir[j]+".");
    	}

   		j--;
   		j = j < 0 ? cir.length-1:j;
   	}

  }
  
  // With no null cells
  public void linearize(){
    
    Object[] copy = new Object[size];

    for(int i=0, j=start; i<size; i++, j=((j+1)%cir.length)){

    	copy[i] = cir[j];
    }

    cir = copy;
    start = 0;
  }
  
  // Do not change the Start index
  public void resizeStartUnchanged(int newcapacity){
    
    Object[] copy = new Object[newcapacity];

    for(int i=0, j=start, k=start; i<size; i++, j = ((j+1)%cir.length), k = ((k+1)%copy.length)){

    	copy[k] = cir[j];
    }

    cir = copy;
  }
  
  // Start index becomes zero
  public void resizeByLinearize(int newcapacity){
    
    Object[] copy = new Object[newcapacity];

    for(int i=0, j=start; i<size; i++, j = ((j+1)%cir.length)){

    	copy[i] = cir[j];
    }

    cir = copy;
    start = 0;
  }
  
  /* pos --> position relative to start. Valid range of pos--> 0 to size.
   * Increase array length by 3 if size==cir.length
   * use resizeStartUnchanged() for resizing.
   */
  public void insertByRightShift(Object elem, int pos){
    
    if(size == cir.length){

    	resizeStartUnchanged(size+3);
    }

    for(int i=pos, j=((start+size)%cir.length); i<size; i++){

    	int temp = j-1;

    	temp = temp < 0 ? cir.length-1:temp;

    	cir[j] = cir[temp];

    	j--;
    	j = j < 0 ? cir.length-1:j;
    }

    cir[((start+pos)%cir.length)] = elem;
    size++;
  }
  
  public void insertByLeftShift(Object elem, int pos){
    
    if(size == cir.length){

    	resizeStartUnchanged(size+3);
    }

    for(int i=0, j=start; i<=pos; i++, j= ((j+1)%cir.length)){

    	int temp = j-1;
    	temp = temp < 0 ? cir.length-1:temp;

    	cir[temp] = cir[j];
    }

    cir[((start+pos)%cir.length)] = elem;
    size++;
    start--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByLeftShift(int pos){
    
  	for(int i=pos, j=((start+pos+1)%cir.length) ;i<size; i++, j=((j+1)%cir.length)){

  		int temp = j-1;
  		temp = temp < 0 ? cir.length-1:temp;

  		cir[temp] = cir[j];
  	}

  	cir[(start+size)%cir.length] = null;
  	size--;
  }
  
  /* parameter--> pos. pos --> position relative to start.
   * Valid range of pos--> 0 to size-1
   */
  public void removeByRightShift(int pos){
    
    for(int i=(start+pos), j=((start+pos)%cir.length); i>=start; i--){

    	int temp = j-1;
    	temp = temp<0 ? cir.length-1:temp;

    	cir[j] = cir[temp];

    	j--;
    	j = j<0 ? cir.length-1:j;
    }

    cir[start] = null;
    start++;
    size--;
  }
  
}