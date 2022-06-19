package recursion;

import binary_trees.tree_definition.Node;

import java.util.LinkedList;
import java.util.Queue;


public class T_1302_Deepest_Leaves_Sum {
   // Given the root of a binary tree, return the sum of values of its deepest leaves.
    public static void main(String[] args) {
        T_1302_Deepest_Leaves_Sum obj = new T_1302_Deepest_Leaves_Sum();
        int answer_recursively = obj.deepestLeavesSum_recursively(obj.getFirstTree());
        int answer_iteratively = obj.deepestLeavesSum_iteratively(obj.getFirstTree());
        System.out.println("answer_recursively = " + answer_recursively);
        System.out.println("answer_iteratively = " + answer_iteratively);
    }

    public int deepestLeavesSum_iteratively(Node<Integer> current) {
        Queue<Node<Integer>> q = new LinkedList<>();
        q.add(current);
        int answer = 0;
        while(!q.isEmpty()){
            answer = 0;
            for(int i =q.size();i>0;i--){
                Node<Integer> front = q.remove();
                answer += front.value;
                if(front.left!=null) q.add(front.left);
                if(front.right!=null) q.add(front.right);
            }
        }
        return answer;
    }

    public int deepestLeavesSum_recursively(Node<Integer> current) {
        int max_depth = measure_depth(current);
        return sum(current, 0, max_depth);
    }

    private int sum(Node<Integer> current, int depth, int max_depth) {
        if(current == null) return 0;
        if(depth == max_depth-1) return current.value;
        return sum(current.left, depth + 1, max_depth) + sum(current.right, depth + 1, max_depth);
    }

    private int measure_depth(Node<Integer> current) {
        if(current == null) return 0;
        else return Math.max(measure_depth(current.left) + 1, measure_depth(current.right) + 1);
    }

    private Node<Integer> getFirstTree(){
        Node<Integer> root = new Node<>(1);
        root.left = new Node<>(2);
        root.left.left = new Node<>(4);
        root.left.right = new Node<>(5);
        root.left.left.left = new Node<>(7);
        root.right = new Node<>(3);
        root.right.right = new Node<>(6);
        root.right.right.right = new Node<>(8);
        return root;
        /*
                1
              /   \
            2       3
           / \        \
          4   5         6
         /                \
        7                  8

    Expected answer = 7+8 = 15
     */
    }

}
