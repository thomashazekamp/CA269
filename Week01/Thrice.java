import java.util.Scanner;

public class Thrice
{
    /* Author: Thomas Hazekamp
     * Date: 13/01/22
     * This program requires 3 inputs as an integer and prints the product as output
     */

     public static void main(String []args)
     {
         Scanner in = new Scanner(System.in);

         System.out.print("Enter three numbers: ");

         int first = in.nextInt();
         int second = in.nextInt();
         int third = in.nextInt();

         int result = first * second * third;

         System.out.println("The product is " + result);
     }
}