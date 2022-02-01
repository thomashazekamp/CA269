import java.util.*;

public class AboveAverage
{
    /* Author: Thomas Hazekamp
    * Date : 01/02/22
    * Description: This program will ask for numbers and print out the numbers which are above average
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();

        System.out.print("Enter " + num + " numbers: ");

        double arrayNumbers[] = new double[num + 1];
        double total = 0;

        for (int i = 0; i < num; i++)
        {
            double newNum = in.nextDouble();
            total += newNum;
            arrayNumbers[i] = newNum;
        }

        double average = total / num;

        System.out.println("The above average numbers are:");

        for (int i = 0; i < num; i++)
        {
            if (arrayNumbers[i] > average)
            {
                System.out.print(" " + arrayNumbers[i]);
            }
        }
        System.out.println();
    }
}