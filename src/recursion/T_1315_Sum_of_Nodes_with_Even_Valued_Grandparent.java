package recursion;

import binary_trees.tree_definition.Node;

public class T_1315_Sum_of_Nodes_with_Even_Valued_Grandparent {
    public static void main(String[] args) {
        T_1315_Sum_of_Nodes_with_Even_Valued_Grandparent obj = new T_1315_Sum_of_Nodes_with_Even_Valued_Grandparent();
        /*
        Given the root of a binary tree, return the sum of values of nodes with an even-valued grandparent.
        If there are no nodes with an even-valued grandparent, return 0.
        A grandparent of a node is the parent of its parent if it exists.
        Input: root = [6,7,8,2,7,1,3,9,null,1,4,null,null,null,5]
        Output: 18
        */
        Node<Integer> head = obj.build_tree();
//        Node.dfs_recursively(head);
        System.out.println(obj.sumEvenGrandparent(head));
    }

    public int sumEvenGrandparent(Node<Integer> root) {
        if(root == null) return 0;
        if(root.value % 2 == 0) return sum_gc(root) + sumEvenGrandparent(root.right) + sumEvenGrandparent(root.left);
        else return sumEvenGrandparent(root.right) + sumEvenGrandparent(root.left);
    }

    private int sum_gc(Node<Integer> root) {
        int sum = 0;
        if(root.left != null) {
            if(root.left.left !=null ) sum += root.left.left.value;
            if(root.left.right != null) sum += root.left.right.value;
        }
        if(root.right != null) {
            if(root.right.left !=null ) sum += root.right.left.value;
            if(root.right.right != null) sum+= root.right.right.value;
        }
        return sum;
    }

    private Node<Integer> build_tree() {
        Node<Integer> head = new Node<>(6,7,8);
        head.left.add_leaves(2, 7);
        head.left.left.left = new Node<>(9);
        head.left.right.add_leaves(1, 4);
        head.right.add_leaves(1, 3);
        head.right.right.right = new Node<>(5);
        return head;
        /*
                      6
                   /     \
                 7        8
                /  \     /  \
               2    7   1    3
              /    /  \       \
             9    1    4       5
         */
    }
}
