package LeetCode.easy.num258;

/**
 * Created By Youze on 10/16/2018
 *
 * Add Digits
 *
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 *
 * Input: 38
 * Output: 2
 * Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
 * Since 2 has only one digit, return it.
 */
public class Solution {

    public int addDigits(int num){
        return num == 0 ? 0 : (num % 9 == 0 ? 9 : num % 9);
    }
}
