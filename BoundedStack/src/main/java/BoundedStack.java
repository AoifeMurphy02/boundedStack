/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

/**
 *
 * @author aoife
 */
public class BoundedStack extends Stack {
  final int maxCapacity;
//3. Contains two constructors (in both cases, your Stack’s constructor should be called first, using super();):
    
    
    
//a. A default constructor that sets your maxCapacity to 10
     public BoundedStack() {
          super();
        this.maxCapacity = 10;
    }
//b. A parameterized constructor that takes 1 parameter – a value for the maxCapacity.
     //i. If the maximum capacity supplied is invalid (<= 0), throw an IllegalArgumentException  
      public BoundedStack(int maxCapacity) {
           super();
           if(maxCapacity <= 0 ){
               throw new IllegalArgumentException();
           }
        this.maxCapacity = maxCapacity;
    }

//    A method called push() that:
//a. Takes 1 parameter, the String to be stored in your stack.
//b. Checks if there is sufficient space left in the Stack to add this element
//i. If the Stack is full, throws an IllegalArgumentException*
//c. If sufficient space exists, uses the push method from the super class to carry out the push logic.
    
    @Override
    public boolean push(String value){
    if(!isFull()){
        throw new IllegalArgumentException();
    }
    push(value);
    return true;
}
//  A method called isFull() that:
//a. Takes no parameters.
//b. Returns true if there is space remaining in the stack.
//c. Returns false if there is no space remaining in the stack.
   
    public boolean isFull(){
        if(maxCapacity < size){
        return false;
    }
        return true;
    }

}
