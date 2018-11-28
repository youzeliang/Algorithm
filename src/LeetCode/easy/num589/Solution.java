package LeetCode.easy.num589;

import org.w3c.dom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by youze on 2018/11/29
 */

public class Solution {

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;

        Stack<Node> stack = new Stack<>();
        stack.add(root);

        while (!stack.empty()) {
            root = stack.pop();
            list.add(root.val);
            for (int i = root.children.size() - 1; i >= 0; i--)
                stack.add(root.children.get(i));
        }

        return list ;
    }
}
