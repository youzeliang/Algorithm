package LeetCode.easy.num804;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by youze on 2018/11/13
 *
 * https://leetcode.com/problems/unique-morse-code-words/description/
 */

public class Solution {

    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0)
            return 0;
        Set<String> res = new HashSet<String>();
        String[] codes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (String w : words) {
            StringBuilder str = new StringBuilder();
            for (char c : w.toCharArray()) {
                int index = alphabet.indexOf(c);
                str.append(codes[index]);
            }
            res.add(str.toString());
        }
        return res.size();
    }
}
