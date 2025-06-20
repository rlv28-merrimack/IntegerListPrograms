import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

//Code reuse can be seen throughout the code below. As noted below, some code is reused from Google
//AI, while others is used from various java packages within the java util packages.

/**
 * Class to take integers from user, sort and return as a linked list
 * @author Rebecca Hawthorne, Google AI
 * @since Week 4 of CS6301
 */
public class LinkedListofIntegers {
        /**
     * Main method of the class which takes integer output and returns a sorted linked list
     * @param args default parameter for a main - not used
     */
    public static void main(String[] args) throws Exception {
        //next line of code is resued from Google AI
         List<Integer> arrayList = new ArrayList<>();
         Scanner scanner = new Scanner(System.in);
            //code in while loop is reused from Google AI edited by me to become a while loop
            while (true) { 
                System.out.print("Enter an integer or type No to end your list: ");
                String input = scanner.nextLine();
                if (input.equals("No") || input.equals("no")) {break;}
                else {
                    try {
                        int number = Integer.parseInt(input);
                        arrayList.add(number);
                        
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid input. Please enter an integer or No to end your list: ");
                    }
                }
           }
           scanner.close();
           //Code to sort is reused from Google AI
           Collections.sort(arrayList);
           LinkedList<Integer> linkedList = new LinkedList<>(arrayList);
           System.out.println("Your linked list is:" + linkedList);
        
    }      
}
