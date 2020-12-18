package com.allinone.practice.Algorithms.BinaryTreeJava;

public class NodeDriver {
    public static void main(String[] args) {
        Node root =new Node(12);
        root.addNode(root,10);
        root.addNode(root,15);
        root.addNode(root,1);
        root.addNode(root,11);
        root.addNode(root,13);
        root.addNode(root,25);


//        node.left= new Node(10);
//        node.right=new Node(15);
//        node.left.left=new Node(1);
//        node.left.right=new Node(11);
//        node.right.left=new Node(13);
//        node.right.right=new Node(25);
        root.inorder(root);
    }
}
