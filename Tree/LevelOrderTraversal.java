package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {
    public static class Node{
        private int data;
        private Node left;
        private Node right;
        
        public Node(int value){
            this.data = value;
        }
        }

        /**
         * Inserts elements into a binary tree in level order.
         *
         * @param arr  The array of elements to be inserted into the tree.
         * @param root The root node of the binary tree.
         * @param i    The current index in the array.
         * @return The root node of the binary tree after insertion.
         *
         * This method recursively inserts elements from the array into the binary tree
         * in level order. It creates a new node for the current element and assigns it
         * to the root. Then, it recursively inserts the left and right children by
         * calculating their respective indices in the array.
         */
        public static Node insertLevelOrder(int[] arr, Node root, int i) {
            if (i < arr.length) {
                root = new Node(arr[i]);

                root.left = insertLevelOrder(arr, root.left, 2 * i + 1);
                root.right = insertLevelOrder(arr, root.right, 2 * i + 2);
            }
            return root;
        }

        public static void main(String[] args) {
        Node root = new Node(5);
        System.out.println(levelOrder(root));
    }

    private static List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<>();
        List<List<Integer>> wrapList = new ArrayList<>();
        if(root == null) return wrapList;
        queue.offer(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> tempList = new ArrayList<>();
            for(int i=0;i<level;i++){
                if(queue.peek().left !=null) queue.offer(queue.peek().left);
                if(queue.peek().right !=null) queue.offer(queue.peek().right);
                tempList.add(queue.poll().data);
            }
            wrapList.add(tempList);
        }
        return wrapList;
    }

}
