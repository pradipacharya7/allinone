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
        System.out.println( "Total::"+root.count_leaves(root));
        System.out.println("Count Even:: "+root.count_even(root));
//        node.left= new Node(10);
//        node.right=new Node(15);
//        node.left.left=new Node(1);
//        node.left.right=new Node(11);
//        node.right.left=new Node(13);
//        node.right.right=new Node(25);
        root.inorder(root);
        System.out.println();

        root.mirror(root);
        root.inorder(root);

    }
}
