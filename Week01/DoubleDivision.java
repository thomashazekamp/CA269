import java.util.Scanner;

public class DoubleDivision
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires 2 inputs as float numbers and prints the quotient as output
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("Please enter two floating point numbers: ");

         double first = in.nextDouble();
         double second = in.nextDouble();

         double result = first / second;

         System.out.println(first + " / " + second + " is " + result);
     }
}