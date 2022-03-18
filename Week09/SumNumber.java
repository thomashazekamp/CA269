import java.util.Scanner;

public class SumNumber
{
    /* Author: Thomas Hazekamp
    * Date : 18/03/2022
    * Description: Getting a number from user and printing the sum of all the numbers utp to that number
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();

        int i = 1;
        int sum = 0;

        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("The sum of the numbers from 1 " + "to " + num + " is " + sum);
    }
}