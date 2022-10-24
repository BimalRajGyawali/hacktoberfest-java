package org.example.compressiontechniques;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class HuffmanEncoder {
    public OutputSingleton traverseHuffmanTree(Node root, String s, OutputSingleton output) {

        if (root.left
                == null
                && root.right
                == null
                && Character.isLetter(root.c)) {

            output.update(root.c + ":" + s);
            return output;

        }
        traverseHuffmanTree(root.left, s + "0", output);
        traverseHuffmanTree(root.right, s + "1", output);
        return null;
    }

    public String compress(String str) {
        ArrayList<Character> charArray = new ArrayList<Character>();
        ArrayList<Integer> charFreq = new ArrayList<Integer>();
        int n = str.length();

        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            charArray.add(str.charAt(i));
            charFreq.add(count);
        }
        PriorityQueue<Node> queue = new PriorityQueue<Node>(n, new NodeComparator());
        for (int i = 0; i < n; i++) {


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


