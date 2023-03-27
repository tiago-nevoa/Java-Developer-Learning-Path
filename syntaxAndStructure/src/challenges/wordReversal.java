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
    public static void main (String[]args){
        Scanner keyborad = new Scanner(System.in);
        System.out.print("Write your phrase: ");
        String word = keyborad.nextLine();
        String [] words = word.split(" ");

        System.out.println("Your Reversal phrase is:");
        for (int i = words.length - 1; i >= 0; i--){
            System.out.print(words[i] + " ");
        }
        keyborad.close();
    }

}
