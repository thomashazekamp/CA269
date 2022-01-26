import java.util.Scanner;

public class Bigger
{
    /* Author: Thomas Hazekamp
    * Date : 26/01/22
    * Description: Given 2 numbers, the program will print which one is the biggest
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter two numbers: ");
        int firstNum = in.nextInt();
        int secNum = in.nextInt();

        if (firstNum > secNum)
        {
            System.out.println(firstNum + " is the biggest.");
        }
        else
        {
            System.out.println(secNum + " is the biggest.");
        }
    }
}