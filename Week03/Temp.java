import java.util.Scanner;

public class Temp
{
    /* Author: Thomas Hazekamp
    * Date : 26/01/22
    * Description: This program is showing how calling methods in Java work
    */

    public static void main(String []args)
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Give me a Fahrenheit temperature: ");
        double fahrTemp = in.nextDouble();

        double celTemp = Convert.fahr2cels(fahrTemp);

        System.out.println("In Celsius that would be: " + celTemp);
    }
}