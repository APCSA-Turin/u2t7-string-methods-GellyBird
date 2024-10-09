import java.util.Scanner;

public class U2T7_MoreStringMethods {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int points = 0;
        String str1 = "";
        String str2 = "";
        int totalWords = 0;

        System.out.print("Enter first word!: ");
        str1 = scan.nextLine();

        while (points <= 50) {
            System.out.print("Enter next word!: ");
            str2 = scan.nextLine();

            if (str2.equals(str1)) {
                System.out.println("-10 points " + str1 + " equals " + str2 + " SCORE: " + points);
            }

            if (str2.compareTo(str1) > 0) { //second word comes after first
                points += 2;
                System.out.println("+2 points " + str2 + " comes after " + str1 + " SCORE: " + points);
            } else { //second word comes befores first
                points -= 5;
                System.out.println("-5 points " + str2 + " comes before " + str1 + " SCORE: " + points);
            }

            if (str2.substring(0, 2).equals(str1.substring(str1.length() - 2))) {
                points += 5;
                System.out.println("+5 points the last two letters of " + str1 + " match the first two letters of " + str2 + " SCORE: " + points);
            }

            if (str2.contains(str1.substring(0,1)) == true) {
                points += 3;
                System.out.println("+3 points the first letter of " + str1 + " is found in " + str2 + " SCORE: " + points);
            }

            str1 = str2;
        }


    }
    
}
