package org.example.deflate;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.util.zip.DeflaterInputStream;
import java.util.zip.InflaterOutputStream;

public class DeflateDemo {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // while it is true
        //noinspection InfiniteLoopStatement
        for (; ; ) {
            String line = scanner.nextLine();

            // the original input of bytes
            byte[] original = line.getBytes();

            // bytes compressed using Deflate stream
            byte[] compressed = deflateCompression(original);

            System.out.println("Compressed length -> " + compressed.length);

            // the decompressed result, the original[] and decompressed[]
            // are equal
            System.out.println("Decompressed result -> " + new String(
                    deflateDecompression(compressed)));
        }
    }

    private static byte[] deflateCompression(byte[] bytes) throws IOException {
        try (DeflaterInputStream stream = new DeflaterInputStream(
                new ByteArrayInputStream(bytes))) {
            return stream.readAllBytes();
        }
    }

    private static byte[] deflateDecompression(byte[] bytes) throws IOException {
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        try (InflaterOutputStream stream = new InflaterOutputStream(result)) {
            stream.write(bytes);
        }
        return result.toByteArray();
    }
}

/*
  This is a test input, provided to deflate which will be compressed and decompressed back.

  Compressed length -> 79

  Decompressed result -> This is a test input, provided to deflate which will be compressed and decompressed back.
 */