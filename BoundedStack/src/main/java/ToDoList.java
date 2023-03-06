/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author aoife
 */
public class ToDoList {

    public static void main(String[] args) {
        //Creates an instance of your Stack class.
        Stack s1 = new Stack();
        //Fills the stack with 10 user-specified tasks (Strings) using your push() method
        s1.push("p1");
        s1.push("p2");
        s1.push("p3");
        s1.push("p4");
        s1.push("p5");
        s1.push("p6");
        s1.push("p7");
        s1.push("p8");
        s1.push("p9");
        s1.push("p10");
        //Displays how many tasks are in the stack using your size() method
        System.out.println(s1.size());
        //Displays the first element in the stack using your peek() method.
        System.out.println(s1.peek());
        //Loop through the Stack and display the content.
        //i. Your loop should be based on the isEmpty() method.
        //ii. You should retrieve each element from the stack using your pop() method.
        while(!s1.isEmpty()){
            System.out.println(s1.pop());
        }
    }
}
