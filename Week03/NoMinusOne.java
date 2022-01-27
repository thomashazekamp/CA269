import java.util.Scanner;

public class NoMinusOne
{
    /* Author: Thomas Hazekamp
    * Date : 27/01/22
    * Description: This program uses a loop to ask for numbers and will print the penultimate number when it encounters a -1
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter numbers: ");
        int num = in.nextInt();
        int penNum = num;

        // Continue asking for a number while the number is not -1
        while (num != -1)
        {
            penNum = num;
            num = in.nextInt();
        }

        // This will make sure -1 is not printed if it is the first inputted number
        if (penNum != -1)
        {
            System.out.println("\nThe penultimate number was: " + penNum); // Printing the penultimate number (number before the -1)
        }
    }
}