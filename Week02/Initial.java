import java.util.Scanner;

public class Initial
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and returns the initial character
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = in.next();
        String initialLetter = name.substring(0, 1);

        System.out.println(name + " starts with the letter " + initialLetter + ".");
    }
}