package week_6_functional_programming.testing_space;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        //this is to convert List to array
        List<Employee> employees = Arrays.asList(
                new Employee("Sampson Gbewa", "Sales", 20000),
                new Employee("Alabo Hamlet", "Sales", 10000),
                new Employee("Royal Mathias", "Sales", 15000),
                new Employee("Ben Comfort","Operation", 3000)
        );

        List<Employee> updatedEmployees= employees.stream()
                //filter based on the department
                .filter(employee -> "Sales".equalsIgnoreCase(employee.getDepartment()))
                //increasing the salaries of the sales department
                        .peek(employee -> employee.setSalary(employee.getSalary()* 1.10))
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
        .toList();

        updatedEmployees.forEach(System.out::println);

    }
}
