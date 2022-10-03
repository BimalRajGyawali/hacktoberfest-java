// Catching exception when array index is out of bound

import java.util.Scanner;

public class ArrayIndexOutOfBound {
  
  public static void main(String[] args) {
    
    int[] days = { 1, 2, 3, 4, 5, 6, 7 };

    try {
      Scanner s = new Scanner(System.in);
      System.out.println("Enter valid day in terms of number(1-7): ");
      int a = s.nextInt();
      s.close();

      System.out.println("Your choose right day: " + days[a-1]);
    }
    
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Wrong input! " + e.getMessage());
    }
  }
}
