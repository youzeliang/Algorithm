package common.string;

/**
 * Created By Youze on 10/3/2018
 */
public class Reverse {


    /**
     * 实现字符串反转
     * @param str
     * @return
     */
    public static String rever(String str){
        if (null==str||str.length()<=1)
            return str;
        return new StringBuffer(str).reverse().toString();
    }
}
