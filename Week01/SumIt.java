import java.util.Scanner;

public class SumIt
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires 2 inputs as integers and prints the numbers and sum
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("Enter two numbers: ");

         int first = in.nextInt();
         int second = in.nextInt();
         int result = first + second;

         System.out.println(first + " and " + second + " is " + result);
     }
}