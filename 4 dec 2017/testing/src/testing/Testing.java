package testing;

import java.util.*;

public class Testing {
    public static Scanner sc= new Scanner(System.in);
    
    public static void main(String[] args) {
        String word = null;
        char[] word2 = null;
        int wordLen = 0;
        int checkChar = 0;
        
        System.out.printf("Please enter a String:");
        word = sc.nextLine();       
        
        word2 = word.toCharArray();
        wordLen = word2.length;
        char[] word3 = new char[wordLen];
        
        for(int i = 0; i < wordLen ; i++){
            word3[i] = word2[wordLen-(i+1)];
        }
        
        for(int i = 0; i < wordLen ; i++){
            if(word3[i] == word2[i]){
                checkChar++;
            }
            else{
                checkChar--;
            }
        }
        
        if(checkChar == wordLen){
            System.out.println("The word is palindrome");
        }
        else{
            System.out.println("The word is not palindrome");
        }
    }
}
