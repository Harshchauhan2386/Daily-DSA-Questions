class Solution {
    public int myAtoi(String str) {
        // Trim leading and trailing whitespace
        str = str.trim();

        // Check if the string is empty after trimming
        if (str == null || str.length() == 0) {
            return 0;
        }

        int result = 0;
        int i = 0;
        int sign = 1;

        // Handle signs
        if (str.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (str.charAt(i) == '+') {
            i++;
        }

        // Convert the characters to an integer
        while (i < str.length()) {
            char currentChar = str.charAt(i);

            // Check if the current character is a digit
            if (currentChar < '0' || currentChar > '9') {
                break;
            }

            int digit = currentChar - '0';

            // Check for overflow or underflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
