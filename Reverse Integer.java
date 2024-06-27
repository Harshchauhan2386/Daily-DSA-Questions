class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int right = x % 10;
            x = x / 10;
            // Check for overflow before updating res
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && right > 7)) {
                return 0; // Overflow
            }
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && right < -8)) {
                return 0; // Underflow
            }
            res = res * 10 + right;
        }
        return res;
    }
}
