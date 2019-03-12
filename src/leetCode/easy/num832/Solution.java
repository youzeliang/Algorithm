package leetCode.easy.num832;

/**
 * Created by youze on 2018/11/10
 *
 * https://leetcode.com/problems/flipping-an-image/description/
 */

public class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        for (int y = 0; y < A.length; y++) {
            for (int x = 0; x < A[y].length / 2; x++) {
                A[y][x] ^= A[y][A[y].length - 1 - x];
                A[y][A[y].length - 1 - x] ^= A[y][x];
                A[y][x] ^= A[y][A[y].length - 1 - x];
            }
            for (int x = 0; x < A[y].length; x++)
                A[y][x] ^= 1;

        }
        return A;
    }
}
