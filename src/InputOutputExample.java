
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pistm9061
 */
public class InputOutputExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // scanner to get user input
        Scanner input = new Scanner(System.in);
        
        // asking their name
        System.out.println("Please enter your name");
        // scanning name into a variable
        String name2 = input.nextLine();
        String name = "Pisters";
        // saying hello
        System.out.println("Hello " + name2);
        
        
        // ask the user what year they were born
        // use this to calculate age
        System.out.println("what year were you born");
        int year = input.nextInt();
        // determine their age
        int age = 2017 - year;
        if (age > 0) {
        System.out.println("You are " + age + " years old!");
        } else{
            System.out.println("Liar!");
        }
        
        
    }
}
