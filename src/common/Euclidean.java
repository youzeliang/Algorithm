package common;

/**
 * 辗转相除法
 * 两个正整数a和b（a>b），它们的最大公约数等于a除以b的余数c和b之间的最大公约数。
 * 比如10和25，25除以10商2余5,那么10和25的最大公约数，等同于10和5的最大公约数。
 * <p>
 * 更相减损术
 * 两个正整数a和b（a>b），它们的最大公约数等于a-b的差值c和较小数b的最大公约数。
 * 比如10和25，25减去10的差是15,那么10和25的最大公约数，等同于10和15的最大公约数。
 * 参考  https://blog.csdn.net/Holmofy/article/details/76401074
 */
public class Euclidean {

    public static int gcd(int a, int b) {
        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        if (b == 0) return a;
        if ((a & 1) == 0 && (b & 1) == 0)
            return gcd(a >> 1, b >> 1) << 1;
        else if ((a & 1) == 0 && (b & 1) != 0)
            return gcd(a >> 1, b);
        else if ((a & 1) != 0 && (b & 1) == 0)
            return gcd(a, b >> 1);
        else
            return gcd(a - b, b);
    }

}
