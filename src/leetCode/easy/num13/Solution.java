package leetCode.easy.num13;

import java.util.HashMap;

/**
 * Created by youze on 2019/3/14
 * <p>
 * https://leetcode.com/problems/roman-to-integer/
 */

public class Solution {
    public static int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        int res = 0, level = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num = map.get(s.charAt(i));
            if (num >= level)
                res += num;
            else res -= num;
            level = num;
        }
        return res;
    }


}
