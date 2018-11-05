package LeetCode.easy.num992;


/**
 * Created by youze on 2018/11/5
 * <p>
 * https://leetcode.com/problems/sort-array-by-parity-ii/description/
 */

public class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int oddindex = 1;
        int evenindex = 0;
        int[] out = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            if (A[i] % 2 == 0) {
                out[evenindex] = A[i];
                evenindex = evenindex + 2;
            } else {
                out[oddindex] = A[i];
                oddindex = oddindex + 2;
            }
        }
        return out;
    }

}
