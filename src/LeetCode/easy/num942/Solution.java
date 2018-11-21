package LeetCode.easy.num942;

/**
 * Created by youze on 2018/11/21
 */

public class Solution {

    public int[] diStringMatch(String S) {
        int[] output = new int[S.length() + 1];
        int in = 0, d = output.length - 1;
        int k = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == 'I') {
                output[i] = in++;
            } else {
                output[i] = d--;
            }
            k = k + output[i];
        }
        int n = S.length() + 1;
        output[output.length - 1] = ((n * (n - 1)) / 2) - k;
        return output;
    }
}
