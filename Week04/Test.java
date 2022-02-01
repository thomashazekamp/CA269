import java.util.Scanner;

public class Test
{
    /* Author: Thomas Hazekamp
    * Date : 01/02/22
    * Description: * above each method
    */

    // This method will return the sum of the array
    public static int getSum(int arrayNums[])
    {
        int sum = 0;

        for (int i = 0; i < arrayNums.length; i++)
        {
            sum += arrayNums[i];
        }

        return sum;
    }

    // Returns the number of 5's in a given array
    public static int countFives(int arrayNums[])
    {
        int count = 0;

        for (int i = 0; i < arrayNums.length; i++)
        {
            if (arrayNums[i] == 5)
            {
                count++;
            }
        }
        return count;
    }

    // Will return the number of even numbers in the given array
    public static int countEven(int arrayNums[])
    {
        int count = 0;

        for (int i = 0; i < arrayNums.length; i++)
        {
            if (arrayNums[i] % 2 == 0)
            {
                count++;
            }
        }
        return count;
    }
}