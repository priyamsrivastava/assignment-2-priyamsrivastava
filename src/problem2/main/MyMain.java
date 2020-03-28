/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;

import problem1.mybst.MyBinarySearchTree;

// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.insert(5);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(15);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(3);
        myBinarySearchTree.insert(1);
        myBinarySearchTree.insert(58);
        myBinarySearchTree.insert(4);
        myBinarySearchTree.insert(78);
        myBinarySearchTree.traversePreOrder(myBinarySearchTree.getRoot());
        System.out.println();
        myBinarySearchTree.traversePostOder(myBinarySearchTree.getRoot());
    }

}