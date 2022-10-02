package org.example.oop;


public class Student_Class {

    public static void main(String[] args) {
        //object has been created of the java class of StudentInfo
        StudentInfo XYZ = new StudentInfo(32,"XYZ",96f,"Chandigarh");
        System.out.println(XYZ.city);
        System.out.println(XYZ.name);
        System.out.println(XYZ.percentage);
        System.out.println(XYZ.rollno);
    }
}
//The StudentInfo is a class which acts as a blueprint so that many more object or to be precise more number of student's information can be stored using it.
class StudentInfo{
    int rollno;
    String name;
    float percentage;
    String city;

    StudentInfo(int rollno,String name,float percentage,String city){
        this.rollno=rollno;
        this.name=name;
        this.percentage=percentage;
        this.city=city;
    }

}
