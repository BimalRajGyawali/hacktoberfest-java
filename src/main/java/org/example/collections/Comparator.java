package org.example.collections;
import java.util.*;


//Demo code of Comparator in java.

class Student{
    private String name;
    private double cgpa;
    public Student(String name, double cgpa) {
        super();
        this.name = name;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }

}

public class Comparator
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<Student>();
        while(testCases>0){
            String name = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(name, cgpa);
            studentList.add(st);
            testCases--;
        }

        studentList.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCgpa() == o2.getCgpa()) {
                    if (o1.getName().compareTo(o2.getName()) > 0) {
                        return 1;
                    } else if (o1.getName().compareTo(o2.getName()) < 0) {
                        return -1;
                    }
                }
                return o1.getCgpa() - o2.getCgpa() > 0 ? -1 : 1;

            }
        });

        for(Student st: studentList){
            System.out.println(st.getName());
        }
    }
}