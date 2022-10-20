package org.example.files;
// Serialization: object to byte stream
// Deserialization: byte stream to object

import java.io.*;
import java.util.Scanner;

class Person implements Serializable {
  
  String name;
  int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  public void showInfo() {
    System.out.println("\nName = " + name + " Age = " + age);
  }
}

public class SerializationAndDeserialization {

  public static void main(String[] args) throws IOException, ClassNotFoundException {
    
    Person p;
    Scanner s = new Scanner(System.in);
    
    // For serializing
    FileOutputStream fos = new FileOutputStream("Testing.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    
    // For deserializing
    FileInputStream fis = new FileInputStream("Testing.txt");
    ObjectInputStream ois = new ObjectInputStream(fis);

    int choice;
    do {
      
      System.out.println("Menu \n1.Write object (serialize) \n2.Read object (deserialize) \n3.Exit");
      System.out.print("\nEnter your choice: ");
      choice = s.nextInt();
      s.nextLine();

      switch (choice) {
        
        case 1:
          System.out.println("\nName: ");
          String name = s.nextLine();
          System.out.println("\nAge: ");
          int age = s.nextInt();
          p = new Person(name, age);

          oos.writeObject(p);
          System.out.println("\nFollowing object written successfully!");
          p.showInfo();
          break;

        case 2:
          System.out.println("\nReading from file....");
          Person q = (Person) ois.readObject(); // ClassNotFoundException required
          q.showInfo();
          break;

        case 3:
          System.out.println("\nExiting...");
          break;

        default:
          System.out.println("\nWrong input!");
      }

    } while (choice != 3);

    s.close();
    oos.close();
    ois.close();
  }
}