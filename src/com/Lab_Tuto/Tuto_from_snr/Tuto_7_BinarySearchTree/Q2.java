package com.Lab_Tuto.Tuto_from_snr.Tuto_7_BinarySearchTree;

public class Q2 {

    public static void main(String[] args) {
        BST<Character> tree = new BST<>();
        char[] c = {'F', 'A', 'C', 'U', 'L', 'T', 'Y'};
        for (char ch : c)
            tree.addNote(ch);

        System.out.println("Number of elements: " + tree.getSize());
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        tree.setOrder(BST.INORDER);
        tree.showTree();
        tree.setOrder(BST.POSTORDER);
        tree.showTree();

        System.out.println("Remove element 'L'");
        tree.remove('L');
        System.out.println("Number of elements: " + tree.getSize());
        tree.setOrder(BST.PREORDER);
        tree.showTree();
        tree.setOrder(BST.INORDER);
        tree.showTree();
        tree.setOrder(BST.POSTORDER);
        tree.showTree();
    }
}
