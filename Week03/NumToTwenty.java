import java.util.Scanner;

public class NumToTwenty
{
    /* Author: Thomas Hazekamp
    * Date : 27/01/22
    * Description: Using a loop it will print out the an inputted number until 20
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = in.nextInt();

        int i = num;
        while(i <= 20)
        {
            System.out.print(i + " ");
            i++;
        }

        System.out.println(); 
    }
}