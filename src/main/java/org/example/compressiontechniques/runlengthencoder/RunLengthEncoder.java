package org.example.compressiontechniques.runlengthencoder;

public class RunLengthEncoder {
    public String compress(String str) {
        String compressedString = null;
        int n = str.length();
        for (int i = 0; i < n; i++) {
            int count = 1;
            while (i < n - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            if (count >= 4 && count <= 259) {
                if (compressedString == null) {
                    compressedString = str.charAt(i) + "!" + count;
                } else {
                    compressedString = compressedString + str.charAt(i) + "!" + count;
                }
            } else {
                for (int j = 1; j <= count; j++) {
                    if (compressedString == null) {
                        compressedString = String.valueOf(str.charAt(i));
                    } else {
                        compressedString = compressedString + String.valueOf(str.charAt(i));
                    }

                }
            }
        }
        return compressedString;
    }
}

