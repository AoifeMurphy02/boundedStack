/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aoife
 */
//  Extends your Stack class
public class BoundedStack extends Stack {

//2. Contains a final int called INITAL_CAP
     private static final int INITAL_CAP = 10;
     private final int cap;
//3. Contains two constructors (in both cases, your Stack’s constructor should be called first, using super();):
    
    
    
//a. A default constructor that sets your INITAL_CAP to 10
     public BoundedStack() {
          super();
          cap = INITAL_CAP;
        
    }
//b. A parameterized constructor that takes 1 parameter – a value for the INITAL_CAP.
     //i. If the maximum capacity supplied is invalid (<= 0), throw an IllegalArgumentException  
      public BoundedStack(int maxCap) {
           super();
          this.cap = maxCap;
        
    }

//    A method called push() that:
//a. Takes 1 parameter, the String to be stored in your stack.
//b. Checks if there is sufficient space left in the Stack to add this element
//i. If the Stack is full, throws an IllegalArgumentException*
//c. If sufficient space exists, uses the push method from the super class to carry out the push logic.
      
    @Override
    public boolean push(String value){
    if(!isFull()){
        throw new StackFullEx("Stack is full");
    }
    
  return super.push(value);
}
//  A method called isFull() that:
//a. Takes no parameters.
//b. Returns true if there is space remaining in the stack.
//c. Returns false if there is no space remaining in the stack.
   
    public boolean isFull(){
        return size < cap;
    }

    

  
}
