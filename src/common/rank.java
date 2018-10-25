package common;

/**
 * @author youzeliang
 * on 2018/4/26
 */
public class rank {

    public static void main(String[] args) {

    }

    /**
     * 二分查找法
     *
     * @param key
     * @param a
     * @return
     */
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) {
                hi = mid - 1;
            } else if (key > a[mid]) {
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
