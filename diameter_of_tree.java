package dynamic_programming;

import org.w3c.dom.Node;

public class diameter_of_tree {
    static int res=Integer.MIN_VALUE;
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
        }
    }

    public static int solve(Node root) {
        if (root == null) {
            return 0;
        }
        int l = solve(root.left);
        int r = solve(root.right);

        int temp = Math.max(l, r)+1;
        int ans = Math.max(temp, 1 + l + r);
            res = Math.max(res, ans);
        return temp;
    }
    public static void main(String[] args) {
//        int res=Integer.MIN_VALUE;
        Node root=new Node(1);
        Node a=new Node(2);
        Node b=new Node(3);
        Node c=new Node(4);
        Node d=new Node(5);
        Node e=new Node(6);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        b.left=e;
//        System.out.println(solve(root));
        solve(root);
        System.out.println(res+1);//diameter =nodes+1
    }
}
