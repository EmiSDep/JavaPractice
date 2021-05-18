package com.emisdep;

import org.w3c.dom.Node;

//Not complete
/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
 */
    public class BinarySearchTree {
    boolean checkBST(Node root) {
            if (root == null) return true;

            if (root.left == null && root.right == null) {
            return true;
            } else if (root.left == null && root.right != null){
            if (root.data < root.right.data){
        return helper(root.right, root.data, Integer.MAX_VALUE);
        } else {
        return false;
        }
        } else if (root.left != null && root.right == null){
        if (root.data > root.left.data) {
        return helper(root.left, root.data, Integer.MIN_VALUE);
        } else {
        return false;
        }
        } else {
        if (root.data > root.left.data && root.data < root.right.data){
        return helper(root.left, root.data, Integer.MIN_VALUE) && helper(root.right, root.data, Integer.MAX_VALUE);
        } else {
        return false;
        }
        }
        }

        boolean helper(Node root, int minValue, int maxValue) {
        if (root == null) return true;

        return root.data > minValue && root.data < maxValue && helper(root.left, minValue, root.data) && helper(root.right, maxValue, root.data);
        }
}