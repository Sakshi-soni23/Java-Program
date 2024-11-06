import java.util.*;

public class check_palindrone_string {
        public static String reverseString(String s, int i, String str) {
            // Base case: stop recursion when index is out of bounds
            if (i < 0) {
                return str;
            }

            // Append current character to the reversed string
            str += s.charAt(i);

            // Recursive call
            return reverseString(s, i - 1, str);
        }

        public static void main(String[] args) {
            String s = "ab";
            String reversedStr = reverseString(s, s.length() - 1, "");

            // Check if original string is equal to its reversed version
            if (s.equals(reversedStr)) {
                System.out.println("This string is a palindrome");
            } else {
                System.out.println("This string is not a palindrome");
            }
        }
    }
