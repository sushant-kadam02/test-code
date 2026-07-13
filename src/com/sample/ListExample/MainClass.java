package com.sample.ListExample;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<Employee> empList = List.of(
                new Employee(101, "Rahul", 25, 50000, new Address("Pune", "MH"), "IT", 201),
                new Employee(102, "Amit", 55, 88000, new Address("Mumbai", "MH"), "HR", 202),
                new Employee(103, "Ria", 28, 77000, new Address("Delhi", "DL"), "Finance", 203),
                new Employee(104, "Kartik", 35, 25000, new Address("Pune", "MH"), "IT", 201),
                new Employee(105, "Suraj", 56, 90000, new Address("Chennai", "TN"), "HR", 202),
                new Employee(106, "Zhoheb", 23, 30000, new Address("Bangalore", "KA"), "Admin", 204),
                new Employee(107, "Sameer", 29, 99000, new Address("Hyderabad", "TS"), "Admin", 204),
                new Employee(108, "Paul", 40, 99001, new Address("Pune", "MH"), "Finance", 203),
                new Employee(109, "John", 21, 25000, new Address("Mumbai", "MH"), "IT", 201)

        );

        //Find all employee name
        List<String> empNames = empList.stream()
                .map(x -> x.getEmpName())
                .toList();

        System.out.println(empNames);

        // empl whose salary > 70000

        List<Employee> empGtr70000 = empList.stream()
                .filter( x -> x.getSalary() > 70000)
                .toList();
        System.out.println("emp > 70000 "+empGtr70000);

        // employee from pune

        List<Employee> fromPune = empList.stream()
                .filter(x -> x.getAddress().getCity().equalsIgnoreCase("pune"))
                .toList();

        System.out.println("From Pune : "+fromPune);

        Long countEmp = empList.stream().count();

        System.out.println("Count : "+countEmp);

        // Avg salary
        Double avgSalary = empList.stream()
                        .collect(Collectors.averagingDouble(Employee::getSalary));

        System.out.println("AvgSalary : "+avgSalary);

        // highest Salary
        Employee highSalEmployee = empList.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .get();
        System.out.println("High salary Employee : "+highSalEmployee);

        // lowest salary

        Employee lowSalEmp = empList.stream()
                .min(Comparator.comparing(Employee::getSalary))
                .get();

        System.out.println("Low salary : "+lowSalEmp);

        empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .forEach(System.out::println);

        System.out.println(" ");

        empList.stream()
                .sorted(Comparator.comparing(Employee::getEmpAge).reversed())
                .forEach(System.out::println);

        // group by department

        Map<String, List<Employee>> groupByDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpDept));

        System.out.println("Group by dept : "+groupByDept);

        // group by city

        Map<String, List<Employee>> groupByCity  = empList.stream()
                .collect(Collectors.groupingBy(x -> x.getAddress().getCity()));

        System.out.println("Group by city : "+groupByCity);

        // count employee by department
        Map<String, Long> countByDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpDept, Collectors.counting()));

        System.out.println("Count by dpet : "+countByDept);

        // Avg salary by dept
        Map<String, Double> avgSalByDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpDept, Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Avg salary by Dept : "+avgSalByDept);

        // Highest salary by Dept

        Map<String, Optional<Employee>> mpHighSalEmpbyDept = empList.stream()
                .collect(Collectors.groupingBy(Employee::getEmpDept,
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary))));


        // second-highest salary

        List<Employee> emp = empList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(1)
                .limit(1)
                .toList();

        System.out.println("Second highest : "+emp);



    }
}
