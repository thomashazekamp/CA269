import java.util.Scanner;

public class HowManyNumbers
{
    /* Author: Thomas Hazekamp
    * Date : 27/01/22
    * Description: This program uses a loop to ask for numbers and returns a count when a -1 is encountered
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int num = in.nextInt();
        int count = 0;

        // Continue asking for a number while the number is not -1
        while (num != -1)
        {
            count++;
            num = in.nextInt();
        }

        System.out.println("\n" + count + " numbers were entered.");
    }
}