package org.example.switchexpression;
class SizeChecker {
public static void main(String[] args) {

    int num = 42;
    String size;

    // switch statement to check size
    switch (num) {

      case 29:
        size = "Small";
        break;
      case 42:
        size = "Medium";
        break;
      case 44:
        size = "Large";
        break;
      case 50:
        size = "Extra Large";
        break;

      default:
        size = "Unknown";
        break;

    }
    System.out.println("Size: " + size);
  }
}
