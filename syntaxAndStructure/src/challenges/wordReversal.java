package challenges;

import java.util.Scanner;

/*
Word reversal
For this challenge, the input is a string of words, and the output should be the words in reverse but with the letters in the original order.
For example, the string “Dog bites man” should output as “man bites Dog.”
After you’ve solved this challenge, try adding sentence capitalization and punctuation to your code.
So, the string “Codecademy is the best!” should output as “Best the is Codecademy!”
 */
public class wordReversal {
    public static String [] getWordsFromKeyboard() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Write your phrase: ");
        String word = keyboard.nextLine();
        // Split the string by words by whitespace characters, ignoring zero or more occurrence of whitespace characters
        return word.trim().split("\\s+");
    }
    public static void printReversal (String [] words){
        System.out.println("Your Reversal phrase is:");
        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
    }
    public static void main (String[]args){
        printReversal(getWordsFromKeyboard());
    }
}
