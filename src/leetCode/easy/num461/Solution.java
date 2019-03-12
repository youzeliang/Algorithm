package leetCode.easy.num461;

/**
 * Created by youze on 18-7-19
 * https://leetcode.com/problems/hamming-distance/description/
 * <p>
 * 将两个二进制数比较，输出不同位数的个数.自己想出来的太辣鸡了。以下是别人的优秀解法
 * 将异或结果一个个移位，然后和1和运算，自然相同为1，不同为0，然后用count器加上这个相同的1自然就是“1出现的次数”
 */
public class Solution {

    public int hammingDistance(int x, int y) {
        int xor = x ^ y, count = 0;
        for (int i = 0; i < 32; i++) {
            count += (xor >> i) & 1;
        }
        return count;
    }
}
