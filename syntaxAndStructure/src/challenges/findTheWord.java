package challenges;

import java.util.Scanner;

/*
Find the word
Starting with an input string of words, find the second-to-last word of the string.
For example, an input of “I love Codecademy” should return “love.”
To make your program more challenging, allow for a second numerical input, n, that results in returning the nth word of a string.
So, for the string “I can program in Java” and n = 3, the output should be the third word, “program.”
 */
public class findTheWord {

    public static int getIntFromKeyboard(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Write Position Number: ");
        return keyboard.nextInt();
    }
    public static void printWordFromPositionN (String [] words, int n){
        System.out.print("The word on position " + n + " is " + words[n-1]);
    }
    public static void main (String[]args){
        printWordFromPositionN(wordReversal.getWordsFromKeyboard(),getIntFromKeyboard());
    }


}