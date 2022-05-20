
package com.company;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Tree<Character> tree = new Tree<>();
        System.out.println("Inserting the following values: ");
        // insert 10 random integers from 0-99 in tree
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            char value = input.next().charAt(0);
            System.out.printf("%s ", value);
            tree.insertNode(value);
        }
        System.out.printf("%n%nPreorder traversal%n");
        tree.preorderTraversal();
        System.out.printf("%n%nInorder traversal%n");
        tree.inorderTraversal();
        System.out.printf("%n%nPostorder traversal%n");
        tree.postorderTraversal();
        System.out.println();
        tree.searchBST('K');
        tree.searchBST('A');
//        F, E, H, D, G, C, B, H, K, J

    }
}
