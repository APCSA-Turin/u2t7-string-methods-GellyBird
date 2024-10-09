import java.util.Scanner;

public class U2T7_StringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter word #1: ");
        String word1 = scan.nextLine();
        System.out.print("Enter word #2: ");
        String word2 = scan.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println(word1 + " is longer");
        } else {
            System.out.println(word2 + " is longer");
        }

        String word1FirstHalf = word1.substring(0, (word1.length()/2));
        String word1SecondHalf = word1.substring((word1FirstHalf.length()));
        
        System.out.println("First half: " + word1FirstHalf);
        System.out.println("Second half: " + word1SecondHalf);

        String word2FirstHalf = word2.substring(0, (word2.length()/2));
        String word2SecondHalf = word2.substring((word2FirstHalf.length()));
        
        System.out.println("First half: " + word2FirstHalf);
        System.out.println("Second half: " + word2SecondHalf);

        if (word1.indexOf(word2) == -1) {
            System.out.println(word2 + " is NOT found in " + word1);
        } else {
            System.out.println(word2 + " is found in " + word1 + " at index " + word1.indexOf(word2));
        }
   
    }
}
