import java.util.Scanner;

public class ReverseArgs
{
    /* Author: Thomas Hazekamp
    * Date : 11/03/2022
    * Description: Program working with argument line, reversing them to output
    */

    public static void main(String []args)
    {
        for (int i = (args.length - 1); i  >= 0; i--) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}