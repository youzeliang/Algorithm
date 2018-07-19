package others.Num1;

import java.math.BigInteger;

/**
 * 有2n个人排队进电影院，票价是50美分。在这2n个人当中，其中n个人只有50美分，另外n个人有1美元（纸票子）。愚蠢的电影院开始卖票时1分钱也没有。
 * 问： 有多少种排队方法 使得 每当一个拥有1美元买票时，电影院都有50美分找钱
 * 注： 1美元=100美分
 * 拥有1美元的人，拥有的是纸币，没法破成2个50美分
 *
 * @author youzeliang
 * on 2018/4/11
 */
public class Solve {
    public static void main(String[] args) {

    }

    static BigInteger getNumber(int n, int m) {
        //当m=1返回Ann即n!
        if (m == 1) {
            return getResult(n, n);
        }
        //初始化result=0
        BigInteger result = new BigInteger("0");
        for (int i = 0; i <= n - m + 1; i++) {
            //利用递归式子求解
            result = result.add((getResult(n, i)).multiply(getNumber(n - i, m - 1)));
        }
        return result;
    }

    static BigInteger getResult(int m, int n) {
        //求Amn
        BigInteger result = new BigInteger("1");
        int count = 0;
        //如果n为0,返回Am0即为1
        if (n == 0) {
            return new BigInteger("1");
        }
        for (int i = m; ; i--) {
            result = result.multiply(new BigInteger("" + i));
            count++;
            if (count == n) {
                break;
            }
        }
        return result;
    }
    /**
     * 符合条件的情况必须是拥有1美元的人前方必须要有50美分的人来排队，要不然不可能找零开，即必须满足从头数50美分的人数大于1美元的人数.

     我们直接求解符合条件的情况.我们先不考虑持有50美分的人的次序,仅考虑持有1美元的人的次序，最后的结果再乘以n! 就可以了.

     可以转化为50美分的人已经排好,由持有1美元的人进行插空排列.

     首先1美元的人是不可能插到队头的，所以可以插的空有n个.

     定义一个函数f(n.m),这表示有n个1美元的人插m个空的方法数,这m个空是从队尾向前数的m个空的位置.

     比如f(4,4)的求解

     ●1●2●3●4  黑点表示50美分的人,1234表示可以插的空

     第一个空可以有0人,可以有1个人.但不可能有2个人及以上

     1.当有1人的时候,这个位置4个人四选一,剩下的方式为f(3,3),故为4*f(3,3)

     2.当没有的人的时候,则方式为f(4,3)

     所以排列方式为f(4,4)=4*f(3,3)+f(4,3)=A(4)(0)*f(4,3)+A(4)(1)*f(3,3)

     注:A(m)(n)在此表示m!/(m-n)! 如A(4)(2)表示4×3=12.A(5)(3)表示5x4x3=60.

     再如:f(4,3)的求解

     是四个人插后三个空,

     ● ●1●2●3 黑点表示50美分的人,123表示可以插的空

     第一个空可以没人,可以1个人,可以2个人,但不能有3人及以上.

     1.当有0人的时候,则只有四个人插后两个空了,即为f(4,2)

     2.当有1人的时候,选其中1人,四选一,剩下的3人插2个空,方法数为4*f(3,2)

     3.当有2人的时候,选其中的2人，四选二排列,剩下的2人插两个空,方法数为A(4)(2)*f(2,2)

     所以排列方式为f(4,3)=f(4,2)+4*f(3,2)+A(4)(2)*f(2,2)=A(4)(0)*f(4,2)+A(4)(1)*f(3,2)+A(4,2)*f(2,2)

     发现规律了吗?在此我们可以总结出递推式
     最后的答案即为A(n)(n)*f(n,n)
     */
}

