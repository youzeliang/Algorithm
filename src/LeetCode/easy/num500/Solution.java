package LeetCode.easy.num500;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by liangyouze on 2018-12-04
 */

public class Solution {

    public String[] findWords(String[] words) {
        String[] letters = new String[]{"qwertyuiop", "asdfghjkl", "zxcvbnm"};
        List<String> ans = new ArrayList<String>();
        for (String word : words) {
            boolean pass = true;
            int row = 0;
            if (letters[1].indexOf(word.toLowerCase().charAt(0)) >= 0)
                row = 1;
            else if (letters[2].indexOf(word.toLowerCase().charAt(0)) >= 0)
                row = 2;
            for (char c : word.toLowerCase().toCharArray()) {
                if (letters[row].indexOf(c) == -1) {
                    pass = false;
                    break;
                }
            }
            if (pass)
                ans.add(word);
        }
        return ans.toArray(new String[ans.size()]);
    }

}
