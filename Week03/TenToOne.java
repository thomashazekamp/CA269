import java.util.Scanner;

public class TenToOne
{
    /* Author: Thomas Hazekamp
    * Date : 27/01/22
    * Description: Using a loop it will print out the numbers 10 to 1
    */

    public static void main(String []args)
    {
        int i = 10;
        while(i >= 1)
        {
            System.out.print(i + " ");
            i--;
        }

        System.out.println(); 
    }
}