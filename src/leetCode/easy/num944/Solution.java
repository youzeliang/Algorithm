package leetCode.easy.num944;

/**
 * Created by youze on 2018/11/27
 * <p>
 * https://leetcode.com/problems/delete-columns-to-make-sorted/description/
 */

public class Solution {
    public int minDeletionSize(String[] A) {
        int count = A[0].length() - 1;        //max index of characters in each string of the array
        int delete_col = 0;                   //number of columns to be deleted
        while (count >= 0) {
            for (int i = 0; i < A.length - 1; i++) {
                if ((int) A[i].charAt(count) > (int) A[i + 1].charAt(count)) { //compare the two characters at the same position of subsequent strings
                    delete_col++;
                    break;
                }
            }
            count--;
        }
        return delete_col;
    }
}
