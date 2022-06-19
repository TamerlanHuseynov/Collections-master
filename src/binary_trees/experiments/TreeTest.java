package binary_trees.experiments;

import binary_trees.tree_definition.Node;

public class TreeTest {
    public static void main(String[] args) {

        Node<Character> treeHead = new Node<>('a', 'b', 'c');
        Node.dfs_recursively(treeHead);
    }

}
