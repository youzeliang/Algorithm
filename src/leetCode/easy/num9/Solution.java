package leetCode.easy.num9;

/**
 * @author youzeliang
 * on 2018/3/2
 * 判断是不是回文数
 * <p>
 * Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
 * <p>
 * https://leetcode.com/problems/palindrome-number/
 */
public class Solution {
    public boolean isPalindrome(int x) {
        int a = 0, b = x;
        while (b > 0) {
            a = a * 10 + b % 10;
            b /= 10;
        }
        if (a == x) {
            return true;
        } else {
            return false;
        }
    }
}
