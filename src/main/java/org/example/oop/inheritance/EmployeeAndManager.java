class Employee {
  String name;
  int id;
  double mSalary;

  public Employee(String name, int id, double mSalary) {
    this.name = name;
    this.id = id;
    this.mSalary = mSalary;
  }

  public double yearlySalary() {
    return mSalary * 12;
  }

  @Override
  public String toString() {
    return "\nName = " + name + " id = " + id + " monthly salary = " + mSalary + " yearlySalary = " + yearlySalary();
  }
}

class Manager extends Employee {
  String depart;

  public Manager(String name, int id, double mSalary, String depart) {
    super(name, id, mSalary);
    this.depart = depart;
  }

  @Override
  public double yearlySalary() {
    return super.yearlySalary() + 10000;
  }

  @Override
  public String toString() {
    return super.toString() + " Department = " + depart;
  }
}

public class EmployeeAndManager {

  public static void main(String[] args) {
    
    Employee e1 = new Employee("Geeta", 1, 10000);
    Employee e2 = new Employee("Sita", 2, 20000);
    Manager m1 = new Manager("Bikram", 1, 20000, "Software");
    Manager m2 = new Manager("Hari", 2, 30000, "IT");

    System.out.print("" + e1 + e2 + m1 + m2);
  }
}
