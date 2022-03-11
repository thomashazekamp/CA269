import java.util.Scanner;

public class Args
{
    /* Author: Thomas Hazekamp
    * Date : 11/03/2022
    * Description: Program working with argument line
    */

    public static void main(String []args)
    {
        for (int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
    }
}