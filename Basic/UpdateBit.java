import java.util.*;
class UpdateBit
{
    public static void main(String args[])
    {
  Scanner sc=new Scanner(System.in);
  int n=5;//0101
  int pos=1;
  int oper=sc.nextInt();//update bit ot 1 else update bit to 0 
  //oper=1:set oper=0:clear
  int bitmask=1<<pos;
  if(oper==1)
 {//set
    
    int newnumber=bitmask|n;
    System.out.println(newnumber);
 }
  else{
     //clear
    int newbm=~bitmask;
    int newnumber=newbm&n;
    System.out.println(newnumber);
 }
    }
}