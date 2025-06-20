import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

//Code reuse can be seen throughout the code below. As noted below, some code is reused from Google
//AI, while others is used from various java packages within the java util packages.

/**
 * Class to take integers from user, sort and return as a stack.
 *<p> Code was adapted from LinkedListofIntegers java code.
 * @author Rebecca Hawthorne, Google AI
 * @since Week 5 of CS6301
 */
public class StackofIntegers {
        /**
     * Main method of the class which takes integer output and returns a sorted stack
     * 
     * <p> Integers are collected from the user one at a time until the user enters
     * "No" or "no". Each input is checked as it is entered to ensure it is an integer (or No/no.) 
     * If input is not an integer the user is notified that they have not entered a valid input and 
     * are asked for further input.
     * 
     * <p> Collected values are stored as an Array List, then sorted. Once sorted each value is 
     * pushed onto a stack. The final sorted stack is then displayed for the user before exiting
     * the program.
     * 
     * <p> Code was refactored from LinkedListofIntegers.java, by removing the code that created
     * the linked list and replacing it with the initiation and for loop filling the stack.
     * 
     * @param args default parameter for a main - not used
     * 
     */
    public static void main(String[] args) throws Exception {
        //next line of code is resued from Google AI
        //initiate an empty ArrayList
         List<Integer> arrayList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
            //code in while loop is reused from Google AI edited by me to become a while loop
            //while loop asks user for an integer or No to exit. Each input is checked to ensure it
            //is an integer.
            while (true) { 
                System.out.print("Enter an integer or type No to end your list: ");
                String input = scanner.nextLine();
                //if No or no is entered the while loop exits and no more user input is allowed.
                if (input.equals("No") || input.equals("no")) {break;}
                else {
                    try {
                        //if the user inputs an integer it is added to arrayList
                        int number = Integer.parseInt(input);
                        arrayList.add(number);
                        
                    } catch (NumberFormatException e) {
                        //if user does not enter No or an integer they recieve an error.
                        System.out.println("Invalid input. Please enter an integer or No to end your list: ");
                    }
                }
           }
           scanner.close();
           //Code to sort is reused from Google AI
           //arrayList is sorted
           Collections.sort(arrayList);
           //the following lines are the code that was changed from the linkedList code.
           //initiate an empty Stack
           Stack<Integer> integerStack= new Stack<>();
           //add each value from the arrayList to the stack
           for (Integer element : arrayList) {
               integerStack.push(element);
            }
            //print stack
           System.out.println("Your stack is:" + integerStack);

    }      
}
