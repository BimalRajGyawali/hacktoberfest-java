package org.example.collections;

import java.util.Map;

public class MapExample {

  /**
   * Small program to demonstrate the creation and functionality of a Map in Java. Displays
   * Key-Value pairs and can be initialized (immutable) via the static factory method {@link
   * Map#of(Object, Object, Object, Object)}.
   */
  public static void main(String[] args) {
    Map<String, String> phoneBook = Map.of("Alex", "+12345678", "Jim", "+98765432");
    System.out.printf("Phonebook of size %d:%n", phoneBook.size());
    phoneBook.forEach((String key, String value) -> System.out.printf("{%s: %s}%n", key, value));
  }

}
