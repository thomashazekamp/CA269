public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {
        char fLetter = word.charAt(0);
        char lLetter = word.charAt(word.length() - 1);

        return lLetter + word.substring(1, word.length() - 1) + fLetter;
    }

    public static int largest(int a, int b, int c)
    {
        int[] nums = {a, b, c};

        int largest = a;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        return largest;
    }
}