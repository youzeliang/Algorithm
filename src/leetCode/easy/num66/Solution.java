package leetCode.easy.num66;

/**
 * Created By Youze on 10/4/2018
 */
public class Solution {
    public static int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i = digits.length - 1; i >= 0; --i) {
            if (digits[i] < 9) {
                ++digits[i];
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[n + 1];
        res[0] = 1;
        return res;
    }
}
