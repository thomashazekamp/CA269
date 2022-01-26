import java.util.Scanner;
import java.lang.Math;

public class Absolute
{
    /* Author: Thomas Hazekamp
     * Date: 26/01/22
     * This program asks for a number and prints out the absolute value of that number
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int num = in.nextInt();
        num = Math.abs(num);

        System.out.println("The absolute value is " + num + ".");
    }
}
