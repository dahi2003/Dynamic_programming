package dynamic_programming;

public class max_path_sum_from_any_node_to_any_node {
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

        int temp = Math.max(Math.max(l, r)+root.val,root.val);
        int ans = Math.max(temp, root.val + l + r);
            res = Math.max(res, ans);
        return temp;
    }
    public static void main(String[] args) {
//        int res=Integer.MIN_VALUE;
        Node root=new Node(10);
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
        solve(root);
        System.out.println("Max path sum from any node to any node: " + res);
    }

}
