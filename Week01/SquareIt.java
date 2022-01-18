import java.util.Scanner;

public class SquareIt
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires an input as an integer and prints the number squared as output
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("Enter a number: ");

         int n = in.nextInt();
         int result = n * n;

         System.out.println(n + " squared is " + result);
     }
}