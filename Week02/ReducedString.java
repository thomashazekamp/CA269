import java.util.Scanner;

public class ReducedString
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a string and the index you would like to remove, returns the string without the indexed letter
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter an integer and a string: ");

        int index = in.nextInt();
        String givenString = in.next();

        String  newString = givenString.substring(0, index) + givenString.substring((index + 1));

        System.out.println(newString);
    }
}