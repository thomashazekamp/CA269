import java.util.Scanner;

public class OneToNum
{
    /* Author: Thomas Hazekamp
    * Date : 27/01/22
    * Description: Using a loop it will print out the numbers 1 to an inputted number
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        for (int i = 1; i <= num; i++)
        {
            System.out.print(i + " ");
        }

        System.out.println(); 
    }
}