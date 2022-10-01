package org.example.files;

import java.io.*;

public class ReadLinebyLine {
    public static void main(String[] args) throws Exception{
        File file = new File("C:\\Users\\SS CUBER\\Desktop\\textfile.txt");//Replace C:\\Users\\SS CUBER\\Desktop\\textfile.txt with the text file path in your computer
        BufferedReader br = new BufferedReader(new FileReader(file));
        String s;
        while((s = br.readLine()) != null)
        {
            //This is to check if lines are retrieved from the file. anything else can be done with the single line stored in variable 's' within this while loop
            System.out.println(s);
        }
        br.close();
    }
}
