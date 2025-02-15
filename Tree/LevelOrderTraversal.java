package Tree;

import org.w3c.dom.Node;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PreorderTraversal {
    public static class Node{
        private int data;
        private Node left;
        private Node right;
        
        public Node(int value){
            this.data = value;
        }
    }


    public static void main(String[] args) {
        Node node = new Node(1);
        node.left.data = 2;
        node.right.data = 3;
        Queue<Integer> queue = new LinkedList<Integer>();
    }
}
