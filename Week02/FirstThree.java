import java.util.Scanner;

public class FirstThree
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and returns the initial  3 chars (as a nickname)
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Tell me your name: ");

        String name = in.next();
        String initialLetters = name.substring(0, 3);

        System.out.println("Your nickname is " + initialLetters + ".");
    }
}