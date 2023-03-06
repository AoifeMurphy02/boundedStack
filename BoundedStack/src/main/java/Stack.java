/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */


import java.util.EmptyStackException;

/**
 *
 * @author aoife
 */
public class Stack {
//    Before you can extend your Stack class, you will need to modify it slightly:
    
//1. Amend your Stack class variables from private to protected.
//2. Amend your Node class and its variables from private to protected.
    protected Node first = null;
    protected int size;
//A Node called first – this will store the first element in the stack (initialized to null).
//    private Node first = null;
//    private int size;
    //An int called count or numElements – this will track how many elements are stored in the stack.
    private int count= 0;

    //A default constructor that sets the first element in the stack to null.
    public Stack() {
        first = null;
    }
   
//    A method called size() that:
//a. Takes no parameters
//b. Returns the number of elements currently stored in your stack.
    public int size() {
        return size;
    }
    //method called isEmpty() that:
//a. Takes no parameters.
//b. Returns true if the stack contains no elements, and false otherwise
    public boolean isEmpty() {
        return size == 0;
       
    }
  //  method called peek() that:
//a. Checks if the stack is empty
//i. If the stack is empty, it should throw an EmptyStack exception
//b. Returns the data stored in the first node.

    public String peek() {
        if( size == 0){
            throw new EmptyStackException();
        }else{
            return first.data;
        }
       
    }
    //A method called push() that:
//a. Takes 1 parameter, the String to be stored in your stack.
//b. Creates a new Node (newNode) containing the data to be added.
//c. Adds newNode to the start of the data in the list. To do this, you should:
//i. Set newNode.next = first (add the new node to the start of the list, in front of the original
//first element)
//ii. Set first = newNode (set the new node to be the official start of the list
    public boolean push(String value) {
        Node newNode = new Node(value);
        newNode.next = first;
        first = newNode;

        size++;
        return true;
    }
//    A method called pop() that:
//a. Takes no parameters.
//b. Checks that the stack is not empty.
//i. If the stack is empty, throws an EmptyStackException
    //  Removes the first element from the stack:
//i. Store a copy of the data from the first element in a temp variable.
//ii. Set first = first.next (i.e. snip the element out of the stack by skipping it)
//d. Updates the number of elements currently stored
//e. Returns the popped element (that you stored in the temporary variable)
    public String pop(){
        if(isEmpty()){
            throw new EmptyStackException(); 
        }
        String temp = first.data;
         
         
         
         first = first.next; 
       
        
        size--;
        return temp;
    }
    

    
//A class called Node. This should:
//i. Be created within the same file as the Stack class.
//ii. Be created as a private static class.
    private static class Node {
//A String called data – The information to be stored in the stack.
//2. A Node called next – This will point to the node after this one in the stack.
//3. A constructor that takes a single parameter, a String representing the data to be
//stored. This constructor should store the incoming information in your data variable,
//and set your next node to null.

        //Amend your Node class and its variables from private to protected.
        protected String data;
        protected Node next;

//         private String data;
//        private Node next;
        public Node(String data) {
            next = null;
            this.data = data;

        }
        //method called hasNext() that returns whether or not next == null.
        public boolean hasNext(){
            return next == null;
        }

    }
}
