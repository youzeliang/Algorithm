package leetCode.easy.num263;

/**
 * Created by youze on 18-7-18
 * <p>
 * https://leetcode.com/problems/ugly-number/description/
 * <p>
 * 其质数因子只能是2,3,5,所以就不断的除以２,3,5，结果等于１就是丑陋数了
 */
public class Solution {


    public boolean isUgly(int num) {
        if (num <= 0) {
            return false;
        }
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }
        return num == 1;
    }

}
