package com.sample.interview;

public final class Employee {
    private final String name;
    private final int age;
    private final int salary;
    private final Address address;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return new Address(address.getCity(), address.getState());
    }

    public int getSalary() {
        return salary;
    }

    public Employee(String name, int age, int salary, Address address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = new Address(address.getCity(), address.getState());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
