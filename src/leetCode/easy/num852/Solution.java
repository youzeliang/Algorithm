package leetCode.easy.num852;

/**
 * Created by youze on 2018/11/20
 *
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */

public class Solution {

    public int peakIndexInMountainArray(int[] A) {

        for (int i = 1; i < A.length; i++) {
            if (!(A[i] > A[i - 1])) {
                return i - 1;
            }
        }
        return 0;
    }
}
