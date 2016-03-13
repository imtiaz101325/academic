/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pkg15101054_stackusecase;

public class ArrayStack implements Stack{
    int size;
    int top;
    Object [] data;
    
    public ArrayStack(){
        size=0;
        top =-1;
        data = new Object[50];
    }
    
// The number of items on the stack
    public int size(){
        
        return size;
    }
// Returns true if the stack is empty
    public boolean isEmpty(){
        
        if(size != 0){
            
            return false;
        }
        
        return true;
    }
   
// Pushes the new item on the stack, throwing the
// StackOverflowException if the stack is at maximum capacity. It
// does not throw an exception for an "unbounded" stack, which
// dynamically adjusts capacity as needed.
    public void push(Object e) throws StackOverflowException{
        
        if(size == data.length){
            
            throw new StackOverflowException();
        }
        
        size++;
        top = size-1;
        data[top] = e;
    }
    
// Pops the item on the top of the stack, throwing the
// StackUnderflowException if the stack is empty.
    public Object pop() throws StackUnderflowException{
        
        if(size == 0){
            
            throw new StackUnderflowException();
        }
        
        Object keep = data[top];
        top--;
        size--;
        
        return keep;
    }
    
// Peeks at the item on the top of the stack, throwing
// StackUnderflowException if the stack is empty.
    public Object peek() throws StackUnderflowException{
    
        if(size == 0){
            
            throw new StackUnderflowException();
        }
        
        return data[top];
    }
    
// Returns a textual representation of items on the stack, in the
// format "[ x y z ]", where x and z are items on top and bottom
// of the stack respectively.
    public String toString(){
    
        String s = "";
        
        for(int i=top; i>=0; i--){
            
            s+=" "+data[i];
        }
        
        return "["+s+" ]";
    }
// Returns an array with items on the stack, with the item on top
// of the stack in the first slot, and bottom in the last slot.
    public Object[] toArray(){
        
        Object[] re = new Object[size];
        
        for(int i=top, j=0; i>=0; i--,j++){
            
            re[j] = data[i];
        }
        
        return re;
    }
// Searches for the given item on the stack, returning the
// offset from top of the stack if item is found, or -1 otherwise.
    public int search(Object e){
        
        boolean status = false;
        
        int j=0;
        for(int i=top; i>=0; i--,j++){
            
            if(data[i].equals(e)){
                
                status = true;
                break;
            }
        }
        
        return j;
    }  
}