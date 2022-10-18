package org.example.bitmanipulation;
class CheckKthBit {
  public static void main(String args[]) {
    int count = 1;
    int n = 18;
    while (n != 0) {
      int newn = n & 1;
      if (newn == 0) {
        count++;
      }
      else {
        System.out.println(count);//2 wil be printed as 18 is 010010,the first set bit from the right side is at position 2.
        break;
      }
      n = n >> 1;
    }
  }
}
