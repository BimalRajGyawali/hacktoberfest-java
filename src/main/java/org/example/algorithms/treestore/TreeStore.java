package org.example.algorithms.treestore;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TreeStore {
    public static class Node {

        Object left;
        Object right;
        final char operator;

        public Node(Object object) {
            this(' ', object, null);
        }

        public Node(char operator, Object left, Object right) {
            this.operator = operator;
            this.left = left;
            this.right = right;
        }

        public void transform(List<Object> list) {
            if (left != null) add(left, list);
            if (right != null) add(right, list);
            // don't add ' ' because
            // it denotes nothing here
            if (operator != ' ') list.add(operator);
        }

        private void add(Object object, List<Object> list) {
            if (object instanceof Node node) {
                // subnode element, then write the element
                // first, this will cause a repeated chain
                // of events
                node.transform(list);
            } else {
                list.add(object);
            }
        }

        @Override
        public String toString() {
            return "Node{" +
                    "left=" + left +
                    ", right=" + right +
                    ", operator=" + operator +
                    '}';
        }

        public static Node toNode(List<Object> list) {
            LinkedList<Object> ints = new LinkedList<>();

            Node root = null;
            for (Object object : list) {
                if (object instanceof Character c) {
                    // the last element is b
                    // because of how items are stored

                    Object b = ints.removeLast();
                    // if there is no more [left node] available, then root
                    // is the left node
                    Object a = ints.size() >= 1 ? ints.removeLast() : root;

                    root = new Node(c, a, b);
                    ints.add(root);
                } else if (object instanceof Integer) {
                    ints.add(object);
                } else throw new IllegalArgumentException("Invalid node data");
            }
            return root;
        }
    }

    public static void main(String[] args) {
        Node node = new Node('+',
                new Node('*',
                        new Node('/', 25, 62), 1),
                new Node('*', 73, 25));

        List<Object> result = new ArrayList<>();
        node.transform(result);
        System.out.println("Node " + result);

        List<Object> parsed = new ArrayList<>();

        // the node that is decoded, from the form
        // of an array

        Node parsedNode = Node.toNode(result);
        parsedNode.transform(parsed);
        System.out.println("Parsed Node " + parsed);

        System.out.println(parsed.equals(result));
    }
}
