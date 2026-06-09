package com.sample.interview;

public class TestImmutable {
    public static void main(String[] args) {
        Address address = new Address("Mumbai","Maharashtra");
        Employee employee = new Employee("Sushant", 33, 199, address);

        System.out.println("Return original Employee : "+employee);

        address.setCity("Pune");
        address.setState("MH");

        System.out.println("After change in address : "+employee);

        Address newAddress = employee.getAddress();
        newAddress.setState("Delhi");
        newAddress.setCity("Delhi");

        System.out.println("After copy address : "+employee);

        System.out.println("Hence, Immutable class will not change its value once passed.");

    }
}
