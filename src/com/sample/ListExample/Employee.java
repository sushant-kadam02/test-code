package com.sample.ListExample;

public class Employee {

    private int id;
    private String empName;
    private int empAge;
    private double salary;
    private Address address;
    private String empDept;
    private int mgrId;

    public Employee(int id, String empName, int empAge, double salary, Address address, String empDept, int mgrId) {
        this.id = id;
        this.empName = empName;
        this.empAge = empAge;
        this.salary = salary;
        this.address = address;
        this.empDept = empDept;
        this.mgrId = mgrId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmpDept() {
        return empDept;
    }

    public void setEmpDept(String empDept) {
        this.empDept = empDept;
    }

    public int getMgrId() {
        return mgrId;
    }

    public void setMgrId(int mgrId) {
        this.mgrId = mgrId;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", empAge=" + empAge +
                ", salary=" + salary +
                ", address=" + address +
                ", empDept='" + empDept + '\'' +
                ", mgrId=" + mgrId +
                '}';
    }
}

