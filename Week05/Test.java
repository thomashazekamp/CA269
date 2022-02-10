import java.util.Scanner;

public class Test
{
    /* Author: Thomas Hazekamp
    * Date : 10/02/22
    * Description: These are methods, a description is above each method
    */

    // This method will return each student's name in a given array
    public static void printName(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i].name);
        }
    }

    // This method will return each student's mark in a given array
    public static void printMark(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i].mark);
        }
    }

    // This method will return each student's name & mark in a given array
    public static void printMarkName(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i].mark + " (" + student[i].name + ")");
        }
    }

    // This method will return each student's mark & name using getters in a given array
    // Note for this method to work you must comment out all the above methods
    public static void printMarkNameGetter(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
        }
    }

    // This method will return each student's mark (if above 55) & name using getters in a given array
    // Note for this method to work you must comment out all the above methods
    public static void printHonours(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 55)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
        }
    }

    // This method will return each student's mark (if between 40 & 49 inclusive) & name using getters in a given array
    // Note for this method to work you must comment out all the above methods
    public static void printForties(Student [] student)
    {
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40 & student[i].getMark() <= 49)
            {
                System.out.println(student[i].getMark() + " (" + student[i].getName() + ")");
            }
        }
    }

    // This method will return a count of students who passed (> 40%)
    // Note for this method to work you must comment out all the above methods
    public static int numberPasses(Student [] student)
    {
        int count = 0;
        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40)
            {
                count++;
            }
        }
        return count;
    }

    // This method will return the student with the highest mark
    // Note for this method to work you must comment out all the above methods
    public static Student getBestStudent(Student [] student)
    {
        int bestMark = student[0].getMark();
        int index = 0;

        for(int i = 1; i < student.length; i++)
        {
            if(student[i].getMark() > bestMark)
            {
                bestMark = student[i].getMark();
                index = i;
            }
        }
        return student[index];
    }

    // This method will return a count of students who passed (> 40%)
    // Note for this method to work you must comment out all the above methods
    public static double getPassingAverage(Student [] student)
    {
        int count = 0;
        double total = 0;

        for(int i = 0; i < student.length; i++)
        {
            if(student[i].getMark() >= 40)
            {
                count++;
                total += student[i].getMark();
            }
        }
        return total / count;
    }
}