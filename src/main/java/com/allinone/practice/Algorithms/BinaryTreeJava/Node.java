package com.allinone.practice.Algorithms.BinaryTreeJava;

public class Node {
    int value;
    Node left;
    Node right;

    public Node(int val){
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

    public Node mirror(Node root){
        if(root==null) return null;
       Node left= mirror(root.left);
       Node right= mirror(root.right);
       root.right=left;
       root.left=right;
       return root;
    }
    public int count_leaves(Node root){
    if(root==null) return 0;
    return (1+count_leaves(root.left)+count_leaves(root.right));
    }

    public int count_even(Node root){
        if(root==null) return 1;
        else if(root.value%2==0) return 1;
      else  return( count_even(root.left)+count_even(root.right));

    }
    public int evenCount(Node root){
        if(root==null) return 0;
        else return  this.count_even(root);
    }

    public void postorder(Node root) {
        if (root != null) {
            inorder(root.left);
            inorder(root.right);
            System.out.print(root.value + " ");

        }
    }
}

