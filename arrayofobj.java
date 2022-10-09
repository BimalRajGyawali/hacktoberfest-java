package org.example.basics;




class Arrayobj
{
public static void main(String args[])
{
Student s[];
s=new Student[5];   //array of objects

s[0]=new Student();
s[1]=new Student();
s[2]=new Student();

s[0].getData(1,"wolf");
s[1].getData(2,"Black");

s[0].printData();
s[1].printData();
}
}
class Student
{
int roll;
String name;

void getData(int r,String n)
{
roll=r;
name=n;
}
void printData()
{
System.out.println(roll);
System.out.println(name);
}
}