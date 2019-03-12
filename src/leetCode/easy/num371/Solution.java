package leetCode.easy.num371;

/**
 * Created By Youze on 10/4/2018
 */
public class Solution {

    public  int getSum(int a, int b) {
        if(a == 0) return b;
        int x = a ^ b;
        int c = (a & b) << 1;
        return getSum(c, x);
    }
}
