import java.util.Scanner;

public class IsTeenager
{
    /* Author: Thomas Hazekamp
    * Date : 26/01/22
    * Description: Given an age as integer, the program display if the age is teenager or not
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = in.nextInt();

        boolean teenager = age > 12 && age < 20;

        if (teenager)
        {
            System.out.println("You are a teenager.");
        }
        else
        {
            System.out.println("You are not a teenager.");
        }
    }
}