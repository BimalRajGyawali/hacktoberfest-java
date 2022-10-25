package org.example.compressiontechniques.huffmanencoder;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HuffmanEncoder {
    public void traverseHuffmanTree(Node root, String s, OutputSingleton output) {

        if (root.left == null && root.right == null && Character.isLetter(root.c)) {
            output.update(root.c + ":" + s + " ");
            return;
        }
        traverseHuffmanTree(root.left, s + "0", output);
        traverseHuffmanTree(root.right, s + "1", output);
    }

    public String compress(String str) {
        ArrayList<Character> charArray = new ArrayList<Character>();
        ArrayList<Integer> charFreq = new ArrayList<Integer>();
        int counter;
        for (int i = 0; i < str.length(); i++) {
            if (charArray.indexOf(str.charAt(i)) >= 0) {
                continue;
            }
            counter = 1;
            charArray.add(str.charAt(i));
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    counter++;
                }
            }
            charFreq.add(counter);
        }
        int charArrayLength = charArray.size();
        PriorityQueue<Node> queue = new PriorityQueue<Node>(charArrayLength, new NodeComparator());
        for (int i = 0; i < charArrayLength; i++) {
            Node node = new Node();
            node.c = charArray.get(i);
            node.data = charFreq.get(i);
            node.left = null;
            node.right = null;
            queue.add(node);
        }
        Node root = null;
        while (queue.size() > 1) {
            Node x = queue.peek();
            queue.poll();
            Node y = queue.peek();
            queue.poll();
            Node f = new Node();
            f.data = x.data + y.data;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
            queue.add(f);
        }
        OutputSingleton outputSingleton = OutputSingleton.getInstance();
        traverseHuffmanTree(root, "", outputSingleton);
        return outputSingleton.getOutputString();
    }
}


