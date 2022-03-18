import java.util.Scanner;

public class FirstMiddleLast
{
    /* Author: Thomas Hazekamp
    * Date : 18/03/2022
    * Description: Printing the first letter, the middle letters, and last letter
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a word: ");
        
        String word = in.nextLine();

        System.out.println(word.charAt(0)); // Printing the first letter

        for (int i = 1; i < word.length() - 1; i++) { // Starting after first letter and ending before last letter
            System.out.print(word.charAt(i)); // Printing the middle letter/s
        }
        System.out.println(); // New line after the middle letters
        System.out.println(word.charAt(word.length() - 1));
    }
}