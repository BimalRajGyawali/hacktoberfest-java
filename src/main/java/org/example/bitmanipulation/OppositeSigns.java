package org.example.bitmanipulation;
class OppositeSigns {
	public static void main(String[] args) {
    int x = 100;
    int y = -100; 
    if ((x ^ y) < 0)
    {
      System.out.println("Signs are opposite"); //will print this
    }
    else
    {
      System.out.println("Signs are not opposite"); 
    }
  }
}
