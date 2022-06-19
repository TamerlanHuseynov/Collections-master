package binary_trees.experiments;

import binary_trees.tree_definition.Node;


public class TreeExperiments {
    public static void main(String[] args) {
        /* String Tree
                    a
                  /   \
                 b     c
                / \     \
               d   e     f
        */
        Node<String> strHead = new Node<>("a");
        strHead.left = new Node<>("b");
        strHead.right = new Node<>("c");
        strHead.left.left = new Node<>("d");
        strHead.left.right = new Node<>("e");
        strHead.right.right = new Node<>("f");

        //Depth first Traversal: a -> b -> d -> e -> c -> f
        Node.dfs_iteratively(strHead);
        Node.dfs_recursively(strHead);
    }



}