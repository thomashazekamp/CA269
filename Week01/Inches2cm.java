import java.util.Scanner;

public class Inches2cm
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires an input (inches) as an integer and prints the centimeters as output
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("Please enter a quantity in inches: ");

         int n = in.nextInt();
         double result = n * 2.54;

         System.out.println(n + " inch is " + result + " cm");
     }
}