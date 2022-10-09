
public class Inheritance {

    // Inheritance is a mechanism in which one class(child class) acquires the properties and behaviour of other class(parent class).

    static class Teacher {
        //data members of parent class
        String designation = "Teacher";
        String collegeName = "Sir MVIT";
        //method of parent class
        void does(){
            System.out.println("Does Teaching");
        }
    }

    public static class PhysicsTeacher extends Teacher{
        //data members of child class
        String mainSubject;
        String name;
        PhysicsTeacher(String name, String mainSubject){
            this.name = name;
            this.mainSubject = mainSubject;
            System.out.println("Details: ");
            System.out.println("Teacher's name: "+this.name);
            System.out.println("College name: "+super.collegeName);
            System.out.println("Designation: "+super.designation);
        }
    }
    public static void main(String[] args){
        PhysicsTeacher physicsTeacher = new PhysicsTeacher("Nageshwari", "Physics");
        //calling the method of parent class
        System.out.println("Main Subject: "+physicsTeacher.mainSubject);
        physicsTeacher.does();
    }

}
