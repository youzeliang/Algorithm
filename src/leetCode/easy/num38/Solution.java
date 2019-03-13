package leetCode.easy.num38;

/**
 * Created by youze on 2019/3/14
 * <p>
 * The count-and-say sequence is the sequence of integers with the first five terms as following:
 * <p>
 * https://leetcode.com/problems/count-and-say/
 */

public class Solution {
    public String countAndSay(int n) {
        String s = "1";

        for (int i = 1; i < n; i++) {
            s = nextNumber(s);
        }

        return s;
    }

    private static String nextNumber(String s) {
        StringBuilder newNumber = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            int counter = 1;

            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                ++counter;
                ++i;
            }
            newNumber.append(counter).append(s.charAt(i));
        }

        return newNumber.toString();
    }

}
