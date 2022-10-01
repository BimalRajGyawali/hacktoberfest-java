import java.io.*;
import java.util.*;
class WriteToFile{
public static void main(String args[]){
try{

    FileWriter f1 = new FileWriter("README.md");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter string to write to file: ");
    String s = sc.nextLine();
    f1.write(s);
    f1.close();
}
catch(Exception e){
    System.out.println(e);
}
}
}