package leetCode.easy.num771;

/**
 * @author youzeliang
 * on 2018/3/5
 */
public class Solution {
    public int numJewelsInStones(String J, String S) {
        int[] count = new int[64];
        for (char c : J.toCharArray()) {
            count[c - 'A']++;
        }
        int ans = 0;
        for (char c : S.toCharArray()) {
            if (count[c - 'A'] >= 1) {
                ans++;
            }
        }
        return ans;
    }
}
