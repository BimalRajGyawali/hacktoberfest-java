package org.example.compressiontechniques.huffmanencoder;

import java.util.Comparator;

public class NodeComparator implements Comparator<Node> {
    public int compare(Node x, Node y) {

        return x.data - y.data;
    }

}
