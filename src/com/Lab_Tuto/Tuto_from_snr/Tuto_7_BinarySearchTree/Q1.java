package com.Lab_Tuto.Tuto_from_snr.Tuto_7_BinarySearchTree;

public class Q1 {

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        int[] numbers = {50, 30, 25, 71, 80, 99, 40, 1, 7, 5};
        for (int i = 0; i < numbers.length; i++)
            tree.addNote(numbers[i]);

        System.out.println("In-order: ");
        tree.setOrder(BST.INORDER);
        tree.showTree();

        System.out.println("Pre-order: ");
        tree.setOrder(BST.PREORDER);
        tree.showTree();

        System.out.println("Post-order: ");
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
    }
}
