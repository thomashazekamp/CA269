import java.util.Scanner;

public class Word
{
    /* Author: Thomas Hazekamp
    * Date : 01/02/22
    * Description: A description is above each method
    */

    // This method when called will return a boolean if a letter is the same as the first letter in the word
    public static boolean isFirstLetter(String word, char c)
    {
        return word.charAt(0) == c;
    }

    // This method when called will return a boolean if a letter is in the given word
    public static boolean containsLetter(String word, char c)
    {
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == c)
            {
                return true;
            }
        }
        return false;
    }

    // This method will check if all the letters in the guessed word are a part of original word
    public static boolean allDone(String word, String guessWord)
    {
        int count = 0;

        // Looping for each letter in the word
        for(int i = 0; i < word.length(); i++)
        {
            // If the current letter from the word is in the guessed word then count goes increments
            if(containsLetter(guessWord, word.charAt(i)))
            {
                count++;
            }
        }

        // The count should be equal to the original words length
        if(count == word.length())
        {
            return true;
        }
        return false;
    }
}