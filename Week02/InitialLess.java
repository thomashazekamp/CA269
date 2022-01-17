import java.util.Scanner;

public class InitialLess
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and returns the name without the initial
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Tell me your name: ");

        String name = in.next();
        String initiallessName = name.substring(1);

        System.out.println("Initialless, your name is " + initiallessName + ".");
    }
}