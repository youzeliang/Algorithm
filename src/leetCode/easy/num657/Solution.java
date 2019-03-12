package leetCode.easy.num657;

/**
 * Created by youze on 2018/11/15
 * <p>
 * https://leetcode.com/problems/robot-return-to-origin/description/
 */

public class Solution {

    public boolean judgeCircle(String moves) {
        float sum = 0;
        for (char c : moves.toCharArray()) {
            sum += c == 'U' ? 1 : (c == 'D' ? -1 : (c == 'L' ? 0.25 : -0.25));
        }
        return sum == 0;
    }
}
