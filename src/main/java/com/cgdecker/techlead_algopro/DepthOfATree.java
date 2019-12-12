package com.cgdecker.techlead_algopro;

public class DepthOfATree{
    public static void main(String[] args) {
        
    }

    public static int getMaxDepth(Node node) {
        if(node == null) return 0;
        else return 1 + Math.max(getMaxDepth(node.left), getMaxDepth(node.right));
    }

}

class Node {
    public Node left;
    public Node right;
    public String value;
    public Node(String value) {
        this.value = value;
    }
}