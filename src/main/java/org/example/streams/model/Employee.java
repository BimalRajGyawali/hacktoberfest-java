package org.example.streams.model;

import java.util.Date;

/**
 * @author rajeshp
 * @Date 10/7/22
 * Employee POJO class to be used by StreamExample class
 */
public class Employee {

    private int employeeId;
    private String employeeName;
    private String city;
    private Date doj;
    private int empSalary;


    public Employee() {
    }

    /**
     *
     * @param employeeId
     * @param employeeName
     * @param city
     * @param doj
     * @param empSalary
     */
    public Employee(int employeeId, String employeeName, String city, Date doj, int empSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.city = city;
        this.doj = doj;
        this.empSalary = empSalary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDoj() {
        return doj;
    }

    public void setDoj(Date doj) {
        this.doj = doj;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", city='" + city + '\'' +
                ", doj=" + doj +
                ", empSalary=" + empSalary +
                '}';
    }
}
