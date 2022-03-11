import java.util.Scanner;

public class TotalArgs
{
    /* Author: Thomas Hazekamp
    * Date : 11/03/2022
    * Description: Printing to output the total sum of all argument numbers
    */

    public static void main(String []args)
    {
        int sum = 0;
        
        for (int i = 0; i < args.length; i++) {
            sum += Integer.parseInt(args[i]);
        }
        System.out.println("The sum of all the args is " + sum + ".");
    }
}