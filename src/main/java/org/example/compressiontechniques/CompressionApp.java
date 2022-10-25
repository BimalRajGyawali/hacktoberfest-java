package org.example.compressiontechniques;

import org.example.compressiontechniques.huffmanencoder.HuffmanEncoder;
import org.example.compressiontechniques.runlengthencoder.RunLengthEncoder;

public class CompressionApp {
    public static void main(String[] args) {
        String rawString = "ABCCCCCCCCDEFGGG";
        RunLengthEncoder runLengthEncoder = new RunLengthEncoder();
        String compressedStringByRunLength = runLengthEncoder.compress(rawString);
        System.out.println(compressedStringByRunLength);
        HuffmanEncoder huffmanEncoder = new HuffmanEncoder();
        String compressedStringByHuffman = huffmanEncoder.compress(rawString);
        System.out.println(compressedStringByHuffman);
    }
}
