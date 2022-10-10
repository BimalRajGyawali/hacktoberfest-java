import java.util.*;
class ClearBit
{
    public static void main(String args[])
    {
     int n=5;//0101
     int pos=2;
     int  bitmask=1<<pos;
     int newbm= ~bitmask;
     int newnumber=newbm&n;
     System.out.println(newnumber);
    }
}