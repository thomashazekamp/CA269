/* -------------------------------------
Group Members: 
Thomas Hazekamp (Student ID: 20423602), 
Aaron Crawford(Student ID: 20336753), 
Eoin Daly (Student ID: 20424366)
---------------------------------------- 
Program Description:
In this program we first ask the user a word (max 5 letters) and return to them the required numbers to print that word, to do this we
go through each individual letter and use our map to find the corresponding letter connected to each of those numbers.
We then asked the user to input numbers to find all possible letter combinations using a recursive function. 
----------------------------------------
*/
import java.util.*;

class PhoneKeyBoard {
    public static void main(String[] args) {
        
        // Creating a map for the numbers which correspond to the letters
        Hashtable<Character, String> map = new Hashtable<Character, String>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        System.out.println("Write the word (max 5 letters) you want to find all possible combinations in an old nokia keyboard!");
        System.out.print("Input word: ");
        Scanner in = new Scanner(System.in); // Asking for input
        String input = in.next(); // Retrieving the string word
        wordConverter(input, map); // Calling the function which will print out the numbers

        System.out.println("Now type numbers to find all possible letter combinations!");
        System.out.print("Input numbers: ");
        input = in.next(); // Retrieving numbers as input
        letterCombinator(input, map); // Calling the function which will printout all possible combinations taken from the input (numbers)
        
        

    }

    public static void letterCombinator(String input, Hashtable<Character, String> map) {

        int CompletedCombinations = 0; // Represents amount of combinations completed
        int totalAmountOfCombinations = 1;
        String answer = ""; // Final answer

        // For loop to find number of combinations needed
        for (int i = 0; i < input.length(); i++) {
            totalAmountOfCombinations *= map.get(input.charAt(i)).length();
        }
        
        recursiveMethod(input, CompletedCombinations, totalAmountOfCombinations, answer, map); // Calling function to find all combinations
    }

    static void recursiveMethod(String input, int CompletedCombinations, int totalAmountOfCombinations, String answer, Hashtable<Character, String> map){

        if (CompletedCombinations > totalAmountOfCombinations - 1) { // Base case, ends recursion when total amount of combinations has been reached
            System.out.println(answer);
            return;
        }

        // Going through each individual letter
        for (int i = 0; i < input.length(); i++) {

            int sum = 1; // Determines how many times a char will 
            // Used to know when to change to following number
            for (int j = i + 1; j < input.length(); j++) {
                sum *= map.get(input.charAt(j)).length();
            }
            int position = CompletedCombinations / sum;
            // While loop to ensure letters are added to correct position, by making sure position is less than the length of the combination
            while (position >= map.get(input.charAt(i)).length()) {
                position -= map.get(input.charAt(i)).length();
            }
            answer += map.get(input.charAt(i)).charAt(position); // Add current letter
        }
        answer += " "; // Adding a space between each combination
        recursiveMethod(input, CompletedCombinations + 1, totalAmountOfCombinations, answer, map);
    }

    static void wordConverter(String word, Hashtable<Character, String> map) {

        String answer = "";
        
        for(int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i); // Gets the individual letter in the word
            for(int j = 2; j < 10; j++) { // Loop to go through each number on nokia phone
                String tmp = Integer.toString(j); // Changing the j value to a string
                String value = map.get(tmp.charAt(0)); // Using tmp to get the corresponding value in the map
                for (int k = 0; k < value.length(); k++) { // Loop to check if letter is in value
                    if (value.charAt(k) == letter){
                        answer += j; // Adds the number to final answer if letter is in map value
                        break; // leaves loop
                    }
                }
            }
        }
        System.out.println(answer); // Returning the numbers needed to find the combinations of letters
    }
}