package LeetCode.easy.num933;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by youze on 2018/11/25
 * <p>
 * https://leetcode.com/problems/number-of-recent-calls/description/
 */

public class RecentCounter {

    Queue<Integer> q;
    Queue<Integer> head;

    public RecentCounter() {
        q = new LinkedList<Integer>();
        head = null;
    }

    public int ping(int t) {
        while (!q.isEmpty() && (t - 3000) > q.peek())
            q.poll();
        q.add(t);
        return q.size();
    }
}
