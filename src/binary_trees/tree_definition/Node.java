package binary_trees.tree_definition;

import java.util.Stack;

public class Node<T> {
    public T value;
    public Node<T> left, right;

    public Node(T value) {
        this.value = value;
        left = null;
        right = null;
    }

    public Node() {}

    public Node(T head_value, T left_child_value, T right_child_value){
        this.value = head_value;
        this.left = new Node<>(left_child_value);
        this.right = new Node<>(right_child_value);
    }

    public static<T> void dfs_iteratively(Node<T> head) {
        if (head == null) return;
        Stack<Node<T>> stack = new Stack<Node<T>>() {{ push(head); }};
        while (!stack.isEmpty()) {
            Node<T> current = stack.pop();
            System.out.println(current.value);
            if (current.right != null) stack.push(current.right);
            if (current.left != null) stack.push(current.left);
        }
    }

    public void add_leaves(T left, T right) {
        this.left = new Node<>(left);
        this.right = new Node<>(right);
    }

    public static<T> void dfs_recursively(Node<T> head) {
        if (head == null) return;
        System.out.println(head.value);
        dfs_recursively(head.left);
        dfs_recursively(head.right);
    }

    //TODO how to treat nulls from leetcode inputs for integers and such??...
    public static<T> Node<T> convert_arr_to_Tree_bfs(T[] arr) {

        return null;
    }

}
