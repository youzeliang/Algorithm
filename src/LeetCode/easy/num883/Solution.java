package LeetCode.easy.num883;

/**
 * Created by youze on 2018/11/28
 *
 * https://leetcode.com/problems/projection-area-of-3d-shapes/description/
 */

public class Solution {

    public int projectionArea(int[][] grid) {
        int sum = 0;
        if (grid == null || grid.length == 0 || grid[0] == null || grid[0].length == 0) {
            return sum;
        }

        int top = 0;
        for (int i = 0; i < grid.length; i++) {
            int left = 0;
            int right = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != 0) {
                    top++;
                }
                left = Math.max(left, grid[i][j]);
                right = Math.max(right, grid[j][i]);
            }
            sum += left;
            sum += right;
        }
        return sum + top;
    }
}
