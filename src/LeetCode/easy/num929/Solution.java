package LeetCode.easy.num929;

import java.util.HashSet;

/**
 * Created by youze on 2018/11/12
 *
 * https://leetcode.com/problems/unique-email-addresses/description/
 */

public class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set = new HashSet<>();
        for (String email : emails) {
            if (!email.equals("")) {
                set.add(reFormat(email));
            }
        }
        return set.size();
    }

    private String reFormat(String s) {
        StringBuilder sb = new StringBuilder();
        int atIdx = s.indexOf('@');
        String pre = preFormat(s.substring(0, atIdx));
        sb.append(pre);
        sb.append(s.substring(atIdx));
        return sb.toString();
    }

    private String preFormat(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == '+') {
                break;
            } else if (c != '.') {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
