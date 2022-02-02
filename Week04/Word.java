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

    // This method operates like the hangman game, if the guessed letter is in the word then it will show the position of the letter followed by underscores
    public static String showLetter(String word, char guessedLetter)
    {
        String result = "";
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) == guessedLetter)
            {
                result += guessedLetter;
            }
            else
            {
                result += "_";
            }
        }
        return result;
    }

    // This method will also work like the hangman game but the word and a string of guessed letter will be given, similar output as showLetter method above but will show all correct guesses in the guess word (string)
    public static String showLetters(String word, String guessString)
    {
        String result = "";
        int status;

        for(int i = 0; i < word.length(); i++)
        {
            status = 0;

            for(int j = 0; j < guessString.length(); j++)
            {
                if(word.charAt(i) == guessString.charAt(j))
                {
                    result += guessString.charAt(j);
                    status = 1; // The letter has been found so we exit the j for loop, and move onto the next letter in the hangman word 
                    break;
                }
            }
            if(status == 0)
            {
                result += "_"
            }
        }
        return result;
    }
}