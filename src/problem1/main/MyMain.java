/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree = new MyBinarySearchTree();
        myBinarySearchTree.insert(50);
        myBinarySearchTree.insert(30);
        myBinarySearchTree.insert(20);
        myBinarySearchTree.insert(10);
        myBinarySearchTree.insert(25);
        myBinarySearchTree.insert(40);
        myBinarySearchTree.insert(35);
        myBinarySearchTree.insert(45);
        myBinarySearchTree.insert(100);
        myBinarySearchTree.insert(60);
        myBinarySearchTree.insert(55);
        myBinarySearchTree.insert(75);
        myBinarySearchTree.insert(150);
        myBinarySearchTree.insert(125);
        myBinarySearchTree.traverseBreadthFirstTraversal(myBinarySearchTree.getRoot());

    }
}
