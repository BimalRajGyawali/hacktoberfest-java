package org.example.compressiontechniques;

public final class OutputSingleton {

    private static OutputSingleton INSTANCE;
    private String output = "";

    private OutputSingleton() {
    }

    public static OutputSingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new OutputSingleton();
        }

        return INSTANCE;
    }

    public void update(String c) {
        output = output + c;
    }

    public String getOutputString() {
        return output;
    }
}