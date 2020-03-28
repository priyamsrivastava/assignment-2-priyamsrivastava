/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.mybst;

import problem1.node.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// to implement BinarySearchTree
public class MyBinarySearchTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void insert(int data) {
        TreeNode node = new TreeNode(data);

        if (root == null) {
            root = node;
        } else {
            TreeNode temp = root;
            TreeNode parent = null;
            while (temp != null) {
                parent = temp;
                if (node.getData() <= temp.getData()) {
                    temp = temp.getLeft();
                } else {
                    temp = temp.getRight();
                }
            }
            if (node.getData() <= parent.getData()) {
                parent.setLeft(node);
                System.out.println("Inserted Left.....");
            } else {
                parent.setRight(node);
                System.out.println("Inserted Right.........");
            }
        }
    }

    public void traversePreOrder(TreeNode node) {
        if (node != null) {
            System.out.print(node.getData() + "  ");
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
        }
    }

    public void traverseInOder(TreeNode node) {
        if (node != null) {
            traversePreOrder(node.getLeft());
            System.out.print(node.getData());
            traversePreOrder(node.getRight());
        }
    }

    public void traversePostOder(TreeNode node) {
        if (node != null) {
            traversePreOrder(node.getLeft());
            traversePreOrder(node.getRight());
            System.out.print(node.getData() + "  ");
        }
    }

    public void traverseBreadthFirstTraversal(TreeNode node) {
        //We take the help of queue in this traversal.
        Stack<TreeNode> stack = new Stack<>();
        TreeNode currentNode2;
        int count = 0;
        if (node != null) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(node);
            while (!queue.isEmpty()) {
                TreeNode currentNode = queue.remove();
                //System.out.print(currentNode.getData() + ",");
                if (currentNode.getLeft() != null) {
                    stack.add(currentNode.getLeft());
                    queue.add(currentNode.getLeft());
                }

                if (currentNode.getRight() != null) {
                    if (currentNode.getRight().getLeft() == null) {
                        count++;
                    }
                    queue.add(currentNode.getRight());
                }

                while (stack.size() > 0) {
                    currentNode2 = stack.pop();
                    System.out.println(currentNode2.getData());
                }
            }
        } else {
            System.out.println("Empty Tree");
        }
        System.out.println("Number Of Left Leaves = " + count);
    }
}
