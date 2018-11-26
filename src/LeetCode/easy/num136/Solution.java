package LeetCode.easy.num136;

/**
 * Single Number
 * Created By Youze on 10/13/2018
 * <p>
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 * Example 1:
 * <p>
 * Input: [2,2,1]
 * Output: 1
 * <p>
 * Example 2:
 * <p>
 * Input: [4,1,2,1,2]
 * Output: 4
 * <p>
 * ^ 不同为1，
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i : nums) {
            result ^= i;
        }
        return result;
    }
}
