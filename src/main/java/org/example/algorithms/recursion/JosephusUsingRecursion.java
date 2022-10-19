package org.example.algorithms.recursion;
import java.util.*;
class JosephusUsingRecursion{
  static void Josh(List<Integer> person, int k, int index)
  {
    if (person.size() == 1) {
      System.out.println(person.get(0));//will print 13
      return;
    }
    index = ((index + k) % person.size());
    person.remove(index);
    // recursive call
    Josh(person, k, index);
  }
  public static void main(String [] args)
  {
    int n = 14;
    int k = 2;
    k--; // (k-1)th person will be killed
    int index = 0;
    List<Integer> person = new ArrayList<>();
    for (int i = 1; i <= n; i++) {
      person.add(i);
    }
    Josh(person, k, index);
  }
}
