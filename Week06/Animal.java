/*
Author: Thomas Hazekamp
Date: 14/02/2022
*/
// This program is showing inheritance

public class Animal
{
    String name;
    
    public Animal(String n)
    {
        name = n;
    }
    
    public String greeting()
    {
        return "Hello, my name is " + name;
    }
}