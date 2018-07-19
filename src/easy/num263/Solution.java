package easy.num263;

/**
 * Created by youze on 18-7-18
 * <p>
 * https://leetcode.com/problems/ugly-number/description/
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int num) {
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
            num /= 3;
        }
        return num == 1;
    }

}
