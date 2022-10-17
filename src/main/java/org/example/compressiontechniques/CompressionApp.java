package org.example.compressiontechniques;

public class CompressionApp {
    public static void main(String args[]) {
        RunLengthEncoder runLengthEncoder = new RunLengthEncoder();
        String compressedString = runLengthEncoder.compress("ABCCCCCCCCDEFGGG");
        System.out.println(compressedString);
    }
}
