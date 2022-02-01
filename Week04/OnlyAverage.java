import java.util.Scanner;

public class OnlyAverage
{
    /* Author: Thomas Hazekamp
    * Date : 01/02/22
    * Description: This program will ask for numbers and print out the average
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("How many numbers: ");
        int num = in.nextInt();

        System.out.print("Enter " + num + " numbers: ");

        double total = 0;
        for (int i = 0; i < num; i++)
        {
            total += in.nextDouble();
        }

        double average = total / num;
        
        System.out.println("The average is " + average);
    }
}