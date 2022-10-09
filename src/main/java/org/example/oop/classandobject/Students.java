public class Students{

    // Class is a blueprint of object
    // Object is an instance of a class that has behaviour and state

    static class Student {

        String name;
        String usn;
        int age;
        String city;
    
        Student(String name, String usn, int age, String city){
            this.name = name;
            this.usn = usn;
            this.age = age;
            this.city = city;
        }
    
        void StudentDetails(){
            System.out.println("Name: "+this.name);
            System.out.println("Usn: "+this.usn);
            System.out.println("Age: "+this.age);
            System.out.println("City: "+this.city);
        }
    }
    
    public static void main(String[] args) {
        // Object 1 of Student class
        Student s1 = new Student("Sneha Pandit","1MV19IS055",22,"Gwalior");
        // Object 2 of Student class
        Student s2 = new Student("Anusha Gupta","1MV19CS017",21,"Mysore");

        System.out.println("Details of Student 1");
        s1.StudentDetails();

        System.out.println("Details of Student 2");
        s2.StudentDetails();
    }
}