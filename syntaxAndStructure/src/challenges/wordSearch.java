package challenges;

import java.util.Scanner;

public class wordSearch {
    public static String getWord(){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Write Word to Search: ");
        return keyboard.next();
    }
    public static int nFinds (String [] words, String word){
        int count = 0;
        for(String s: words) if (s.equals(word)) count++;
        return count;
    }
    public static void main(String[] args) {
        int n = nFinds(wordReversal.getWordsFromKeyboard(),getWord());
        System.out.println("The word was find " + n + " times.");
    }
}
