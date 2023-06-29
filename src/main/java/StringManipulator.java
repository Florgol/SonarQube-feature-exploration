/**
 * This class provides various methods for manipulating strings.
 */
public class StringManipulator {

    /**
     * Converts given string to upper case.
     *
     * @param str the input string
     * @return a new string with all characters converted to upper case
     */

    public String toUpperCase(String str) {
        return str.toUpperCase();
    }

    /**
     * Converts given string to lower case.
     *
     * @param str the input string
     * @return a new string with all characters converted to lower case
     */

    public String toLowerCase(String str) {
        return str.toLowerCase();
    }

    /**
     * Reverses given string.
     *
     * @param str the input string
     * @return a new string that is the reverse of the input string
     */

    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * We count the occurrences of a given character a string.
     *
     * @param str the input string
     * @param c the character to count
     * @return the number of occurrences of the character in the string
     */

    public int countOccurrences(String str, char c) {
        if (str == null)
            throw new IllegalArgumentException("Null string input is not allowed");
        return (int) str.chars().filter(ch -> ch == c).count();
    }

    /**
     * Checks whether the given string is a palindrome.
     * The function is case-insensitive and also we ignore white spaces!
     *
     * @param str the input string
     * @return true if the string is a palindrome, false otherwise
     */

    public boolean isPalindrome(String str) {
        String reversed = reverse(str);
        reversed = reversed.replace(" ", "");
        return str.replace(" ", "").equalsIgnoreCase(reversed);
    }

    /**
     * Removes whitespace characters from a given string.
     *
     * @param str the input string
     * @return a new string with all whitespace characters removed
     */

    public String removeWhitespaces(String str) {
        return str.replace(" ", "");
    }

    public static void main(String[] args){

        StringManipulator sm = new StringManipulator();
        System.out.println(sm.isPalindrome("radar"));
        System.out.println(sm.isPalindrome("nur du Gudrun"));
    
    }
}
