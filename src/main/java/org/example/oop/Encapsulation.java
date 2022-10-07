/*
Encap is the variables of a class will be 
hidden from other classes, and can be accessed only through th emthods of their current class
its increased security of data

*/
public class Encapsulation {
    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
        //get returns the variable value
    }

    public void setName(String newname){
        this.name = newname;
        //this keyword use to refer to the current object
    }

    public void setAge(int newage){
        this.age = newage;
    }
    public static void main(String args[]){
        Encapsulation encap = new Encapsulation();
        encap.setName("Oliver"); // set the name
        encap.setAge(24); //set the age

        System.out.println ("Name:"+ encap.getName()+ "Age" + encap.getAge()); // get the value
    }
}