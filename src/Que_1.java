import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Que_1 {
    public static void main(String[] args) {
        /*
         * Anagram is to create a new word from other word's characters.
         * Write java code to check if two words are anagram or not
         * isAnagram("listen", "Silent") ==> anagram
         * Dormitory = Dirty room
         * School master = The classroom
         * Conversation = Voices rant on
         * Listen = Silent
         * Astronomer = Moon starer
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter the first word: ");
        String word1=scan.nextLine();
        System.out.println("Please enter the second word: ");
        String word2= scan.nextLine();

        System.out.println( isAnagram(word1,word2));

    }

    public static String isAnagram(String str1, String str2) {
        String[] arr1 = str1.replace(" ", "").split("");
        String[] arr2 = str2.replace(" ", "").split("");

        if (arr1.length == arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i].equalsIgnoreCase(arr2[i])) {
                    return  "Anagram";
                }else{
                    return "Not Anagram";
                }
            }
        }
           return "Not anagram";

    }


    public static void isAnagram2(String str1,String str2){
        String[] arr1=str1.toLowerCase(Locale.ROOT).replace(" ","").split("");
        String[] arr2= str2.toLowerCase(Locale.ROOT).replace(" ","").split("");

        if(arr1.length== arr2.length){
            Arrays.sort(arr1);
            Arrays.sort(arr2);
          if(Arrays.equals(arr1,arr2)){
              System.out.println("Anagram");
          }

        }else{
            System.out.println("Not anagram");
        }
    }
}
