import java.util.Scanner;

public class Reverse
{
    /* Author: Thomas Hazekamp
    * Date : 01/02/22
    * Description: Printing a reversed array
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();

        System.out.print("Enter " + num + " numbers: ");

        int arrayNumbers[] = new int[num + 1];

        for (int i = 0; i < num; i++)
        {
            arrayNumbers[i] = in.nextInt();
        }

        System.out.print("The numbers reversed are:");

        for (int i = num - 1; i >= 0; i--)
        {
            System.out.print(" " + arrayNumbers[i]);
        }
        System.out.println();
    }
}