
import java.util.Scanner;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pistm9061
 */
public class StringManipulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create a scanner
        Scanner input = new Scanner(System.in);

        while (true) {
            // get a word from user
            System.out.println("Please enter a word");
            String word = input.nextLine();

            // if someone enters END it stops the program
            if(word.equals("END")){
                break;
            }
            //// CLEANING STRINGS
            // convert to lowercase
            word = word.toLowerCase();

            // fix 1337 (leet) speak
            // change all 3's to e's
            word = word.replace("3", "e");
            // change all @'s to a's
            word = word.replace("@", "a");
            // change all 0's to o's
            word = word.replace("0", "o");
            // change all 1's to l's
            word = word.replace("1", "l");

            // find length of string
            int length = word.length();
            System.out.println("That words length is " + length);

            // pull out a single letter
            char letter = word.charAt(0);
            System.out.println("Character at 0 is " + letter);

            // print out each letter in the word
            // 
            for (int i = 0  +0; i < length;
            i++
            
                ){
        // get the character at position i
        char character = word.charAt(i);
                // print the character
                System.out.println(character);

                // see if it is a vowel
                if (character == 'a'
                        || character == 'e'
                        || character == 'i'
                        || character == 'o'
                        || character == 'u') {

                    // breaking up the string where the vowel is found
                    String firstHalf = word.substring(0, i);
                    String secondHalf = word.substring(i);

                    // create translated word
                    String tWord = secondHalf + firstHalf + "ay";

                    // show teh user Pig Latin
                    System.out.println("Your word in Pig Latin is " + tWord);

                    // stop looking for more vowels
                    break;

                }
            }
        }
    }
}