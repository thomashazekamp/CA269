import java.util.Scanner;

public class NextYear
{
    /* Author: Thomas Hazekamp
     * Date: 17/01/22
     * This program asks for a name and age, it outputs the the age for the following year
     */

     public static void main(String []args)
     {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your name: ");
        String name = in.next();

        System.out.print("What age are you: ");
        int age = in.nextInt();

        System.out.println("Hello " + name + ", next year you will be " + (age + 1) + ".");
     }
}