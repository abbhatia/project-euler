package com.cgdecker.algopro;

public class DepthOfATree{
    public static void main(String[] args) {
        Node root = new Node("a");

        root.left = new Node("b");
        root.right = new Node("c");
        root.left.left = new Node("d");
        root.left.left.right = new Node("e");

        System.out.println(root);
        System.out.println(getMaxDepth2(root,0));


    }

    public static int getMaxDepth(Node node) {
        if(node == null) return 0;
        else return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
    }

    public static int getMaxDepth2(Node node, int depth) {
        if(node == null) return depth;
        if(node.left == null && node.right == null) return depth + 1;
        if(node.left  == null) return getMaxDepth2(node.right, depth + 1);
        if(node.right  == null) return getMaxDepth2(node.left, depth + 1);
        return Math.max(getMaxDepth2(node.left, depth + 1), getMaxDepth2(node.right, depth + 1));
    }

}

class Node {
    public Node left;
    public Node right;
    public String value;
    public Node(String value) {
        this.value = value;
    }
    @Override
    public String toString() {
        return value;
    }
}
