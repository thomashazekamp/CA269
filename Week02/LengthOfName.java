import java.util.Scanner;

public class LengthOfName
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and returns the name length
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your name: ");

        String name = in.next();
        int nameLength = name.length();

        System.out.println("Hello " + name + ", your name has " + nameLength + " letters.");
    }
}