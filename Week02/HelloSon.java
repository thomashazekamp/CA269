import java.util.Scanner;

public class HelloSon
{

    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program requires a name as a string and prints an output
     */

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Tell me your name: ");
        String name = in.next();        // Note that the Scanner method, next(), reads in a word.
        
        System.out.println("Hello " + name);
    }
}