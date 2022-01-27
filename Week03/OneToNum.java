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

        int i = 1;
        while(i <= num)
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); 
    }
}