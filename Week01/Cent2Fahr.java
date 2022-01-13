import java.util.Scanner;

public class Cent2Fahr
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires an input (Centigrade) as an integer and prints the Fahrenheit conversion as output
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         int n = in.nextInt();
         double result = ((double) n * 9/5) + 32;

         System.out.println(n + " " + result);
     }
}