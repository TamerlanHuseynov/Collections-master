package LeetCode.Trees;

import binary_trees.tree_definition.Node;

import java.util.HashSet;
import java.util.Set;

public class T_653_Two_Sum_IV_Input_is_a_BST {
//    https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
    public static void main(String[] args) {
        T_653_Two_Sum_IV_Input_is_a_BST obj = new T_653_Two_Sum_IV_Input_is_a_BST();

        /*
                    5
                  /   \
                 3     6
               /  \     \
              2    4     7

         */



        Node<Integer> head = new Node<>(5, 3, 6);
        head.left.add_leaves(2, 4);
        head.right.add_leaves(null, 7);

        Node<Integer> singlyNode = new Node<>(1); //edge case (affects when we add value to set for case [1] k=2

        System.out.println("Multiple values = " + obj.findTarget(head, 9));
        System.out.println("Singly Node = " + obj.findTarget(singlyNode, 1));
    }

    Set<Integer> set = new HashSet<>();
    public boolean findTarget(Node<Integer> root, int k) {
        if( root == null ) return false;
        if(set.contains(root.value)) return true;
        set.add(k - root.value);
        if(findTarget(root.left, k)) return true;
        return findTarget(root.right, k);
    }

}
