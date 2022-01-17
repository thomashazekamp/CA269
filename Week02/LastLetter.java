import java.util.Scanner;

public class LastLetter
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and returns the last character in the name
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name: ");

        String name = in.next();
        int nameLength = name.length();
        String lastLetter = name.substring((nameLength - 1));

        System.out.println("The last letter of your name is " + lastLetter + ".");
    }
}