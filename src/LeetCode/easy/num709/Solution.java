package LeetCode.easy.num709;


/**
 * Created by youze on 18-7-19
 * https://leetcode.com/problems/to-lower-case/description/
 * <p>
 * 字符串返回小写，可以先转化为数组，然后遍历转换
 */
public class Solution {

    public String toLowerCase(String str) {
        char chrs[] = str.toCharArray();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            chrs[i] = Character.toLowerCase(chrs[i]);
        }
        return str.toLowerCase();
    }
}
