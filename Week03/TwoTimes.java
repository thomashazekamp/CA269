import java.util.Scanner;

public class TwoTimes
{
    /* This program was used to show how methods work in Java
     * The Helper java file is:
      public class Helper
      {
         public static int twoTimes(int num)
         {
             return num * 2;
         }
      }
    */
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        
        // Ask the user to enter a number
        System.out.print("Enter a number: ");
        
        int num = in.nextInt();
        
        // Call the Helper.twoTimes() method to calculate the result
        int result = Helper.twoTimes(num);
        
        // prepare the user for the result
        System.out.println("Times two is: " + result);
    }
}