class StudentInfo
{
 int roll=1;
 String name="Wolf";
  void printData()
   {
     System.out.println(roll);
     System.out.println(name);
    }
}
class StudentMarks extends StudentInfo
{
 int m3=60;
  void printMarks()
{
System.out.println(m3);
}
}
class StudentFees extends StudentInfo
{
String fees="clear";
  void printFees()
{
System.out.println(fees);
}
}
class Hierarchical
{
public static void main(String args[])
{
StudentMarks s1=new StudentMarks();
StudentFees s2=new StudentFees();
s1.printData();
s1.printMarks();
s2.printFees();
}
}
 