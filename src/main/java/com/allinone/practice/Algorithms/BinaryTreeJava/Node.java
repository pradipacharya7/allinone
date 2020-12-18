package com.allinone.practice.Algorithms.BinaryTreeJava;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int val) {
        this.value = val;
        this.left = null;
        this.right = null;
    }


    public Node addNode(Node curr, int val ){
        if(curr==null){
            curr=new Node(val);
        }
        if(val<curr.value){
            curr.left=addNode(curr.left,val);
        }
        else if(val>curr.value){
            curr.right=addNode(curr.right,val);
        }else{
            return curr;
        }
    return curr;
    }

    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }

    public void preorder(Node root) {
        if (root != null) {
            System.out.print(root.value + " ");
            inorder(root.left);
            inorder(root.right);
        }
    }

    public void postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.value + " ");

        }
    }
}

