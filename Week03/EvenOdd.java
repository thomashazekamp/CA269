import java.util.Scanner;

public class EvenOdd
{
    /* Author: Thomas Hazekamp
    * Date : 26/01/22
    * Description: Program gets a number and prints out if it is even or odd
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        if (num % 2 == 0)
        {
            System.out.println(num + " is even.");
        }
        else
        {
            System.out.println(num + " is odd.");
        }
    }
}