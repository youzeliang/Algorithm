package LeetCode.easy.num905;

/**
 * Created by youze on 2018/11/14
 * <p>
 * https://leetcode.com/problems/sort-array-by-parity/description/
 */

public class Solution {

    public int[] sortArrayByParity(int[] A) {
        int[] res = new int[A.length];
        int countEven = 0;
        int countOdd = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                res[countEven] = A[i];
                countEven++;
            } else {
                res[A.length - 1 - countOdd] = A[i];
                countOdd++;
            }
        }
        return res;
    }
}
