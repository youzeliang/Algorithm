package leetCode.easy.num7;

/**
 * @author youzeliang
 * on 2018/3/2
 * <p>
 * <p>
 * Given a 32-bit signed integer, reverse digits of an integer.
 * <p>
 * https://leetcode.com/problems/reverse-integer/
 */
public class Solution {
    public  static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int t = res * 10 + x % 10;
            if (t / 10 != res) {
                return 0;
            }
            res = t;
            x /= 10;
        }
        return res;
    }
}
