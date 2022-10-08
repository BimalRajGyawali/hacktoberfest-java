package org.example.streams;

import org.example.streams.model.Employee;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author rajeshp
 * @Date 10/7/22
 * Stream Example class demonstrates , some of the Streams feature to find minimum, maximum, sum and group by Features by
 * iterating an ArrayList of Employee Objects
 */
public class StreamExample {

    public static void main(String[] args) {

        StreamExample objStreams = new StreamExample();

        ArrayList<Employee> empList = objStreams.initializeData();

        System.out.println("Employee Names--" + objStreams.getEmployeeNames(empList));

        System.out.println("Employee with minimum salary--" + objStreams.minSalary(empList));

        System.out.println("Employee with maximum salary--" + objStreams.maxSalary(empList));

        System.out.println("Total Salary paid--" + objStreams.totalSalary(empList));

        System.out.println("Employee City--" + objStreams.employeesMappedByCity(empList));

        System.out.println("Employees joined after Mar 2021--" + objStreams.filterByDoj((empList),"10-Mar-2021"));

    }

    /**
     *
     * @param emps
     * @return List of Employees
     * This method collects only the employee name from a List of objects
     */
    private List<String> getEmployeeNames(ArrayList<Employee> emps) {
        List<String> collect = emps.stream().map(x -> x.getEmployeeName()).collect(Collectors.toList());
        return collect;
    }

    /**
     *
     * @param emps
     * @return Employee with minimum Salary
     * This method finds the employee with minimum Salary
     */
    private Employee minSalary(ArrayList<Employee> emps) {

        Employee emp = emps.stream().min(Comparator.comparingInt(Employee::getEmpSalary)).get();
        return emp;
    }

    /**
     *
     * @param emps
     * @return Employee with maximum Salary
     * This method finds the employee with maximum Salary
     */

    private Employee maxSalary(ArrayList<Employee> emps) {

        Employee emp = emps.stream().max(Comparator.comparingInt(Employee::getEmpSalary)).get();
        return emp;
    }

    /**
     *
     * @param emps
     * @return Sum of total Employee Salary
     * This method sums the employee with maximum Salary
     */
    private double totalSalary(ArrayList<Employee> emps) {

        double salarySum = emps.stream().map(Employee::getEmpSalary).reduce(0, Integer::sum);
        return salarySum;
    }

    /**
     *
     * @param emps
     * @return List of employees grouped by City
     */
    private Map<String, List<Employee>> employeesMappedByCity(ArrayList<Employee> emps){

    Map<String, List<Employee>> empMap = emps.stream()
            .collect(Collectors.groupingBy(Employee::getCity));

    return empMap;

    }

    /**
     *
     * @param emps
     * @param startDate
     * @return List of employess who have joined after the specified Start Date
     */
    private List<Employee> filterByDoj(ArrayList<Employee> emps,String startDate){

        SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
        List<Employee> filteredEmpList = null;

        try {
            Date start  = sf.parse((startDate));

            filteredEmpList =
                    emps.stream()
                            .filter(employee -> employee.getDoj().compareTo(start) > 0)
                            .collect(Collectors.toList());

        } catch (ParseException e) {
            e.printStackTrace();
        }

        return filteredEmpList;

    }


        /**
         * @return List of Employess
         * This method initializes Employee object and returns to main method
         */
    private ArrayList<Employee> initializeData() {

        SimpleDateFormat sf = new SimpleDateFormat("dd-MMM-yyyy");
        ArrayList<Employee> objEmployeeList = new ArrayList<>();

        try {

            Employee emp1 = new Employee(101, "Tommy", "New Orleans", sf.parse("10-Oct-2021"), 10000);
            Employee emp2 = new Employee(102, "David", "Seattle", sf.parse("19-Jan-2020"), 20000);
            Employee emp3 = new Employee(103, "Mike", "Houston", sf.parse("11-May-2019"), 9000);
            Employee emp4 = new Employee(104, "Joseph", "Houston", sf.parse("10-Mar-2018"), 12000);
            Employee emp5 = new Employee(105, "Andreas", "Dallas", sf.parse("21-Jan-2021"), 15000);
            Employee emp6 = new Employee(106, "Brandon", "Panama City", sf.parse("10-Mar-2021"), 10000);
            Employee emp7 = new Employee(107, "Nick", "Tampa", sf.parse("10-Oct-2021"), 12000);
            Employee emp8 = new Employee(108, "Chris", "New Orleans", sf.parse("15-Mar-2020"), 11000);
            Employee emp9 = new Employee(109, "Ray", "Seattle", sf.parse("12-Apr-2020"), 9000);
            Employee emp10 = new Employee(110, "Rene", "Tampa", sf.parse("10-Jan-2021"), 15000);

            objEmployeeList.add(emp1);
            objEmployeeList.add(emp2);
            objEmployeeList.add(emp3);
            objEmployeeList.add(emp4);
            objEmployeeList.add(emp5);
            objEmployeeList.add(emp6);
            objEmployeeList.add(emp7);
            objEmployeeList.add(emp8);
            objEmployeeList.add(emp9);
            objEmployeeList.add(emp10);

        } catch (ParseException e) {
            System.out.println("Exception in parsing given date");
        }

        return objEmployeeList;
    }


}
