package dynamic_programming;

public class Max_path_sum_from_leaf_to_leaf {
    static int res=Integer.MIN_VALUE;
    public static class Node{
        int val;
        Node left;
        Node right;
        Node(int val) {
            this.val = val;
        }
    }
    public static int maxsum(Node root) {
        if(root==null){
            return 0;
        }
        if (root.left == null && root.right == null) return root.val;

        int l=maxsum(root.left);
        int r=maxsum(root.right);
        if (root.left != null && root.right != null) {
            res = Math.max(res, l + r + root.val);
            return Math.max(l, r) + root.val;
        }
        return (root.left != null ? l : r) + root.val;

    }
    public static void main(String[] args) {
        Node root=new Node(10);
        Node a=new Node(2);
        Node b=new Node(10);
        Node c=new Node(20);
        Node d=new Node(1);
        root.left=a;
        root.right=b;
        a.left=c;
        a.right=d;
        Node e=new Node(-25);
        b.right=e;
        Node f=new Node(3);
        e.left=f;
        Node g=new Node(1);
        e.right=g;
        maxsum(root);
        System.out.println("Max leaf-to-leaf path sum: " + res);

        System.out.println("max path sum for leaf to node :"+maxsum(root));
    }
}
