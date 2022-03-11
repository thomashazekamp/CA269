import java.util.Scanner;

public class Catch
{
    /* Author: Thomas Hazekamp
    * Date : 11/03/2022
    * Description: Catching multiple exception errors
    */

    public static void main(String [] args)
    {
        try {
            Broken broke = new Broken();

            System.out.println("Testing");
            broke.cracked();
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } finally {
            System.out.println("Finally");
        }
    }
}