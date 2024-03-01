package Java8.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class Employee1 implements Comparable<Employee1> {
    String Name;
    int Id;
    int Salary;

    Employee1(String Name, int Id, int Salary) {
        this.Name = Name;
        this.Id = Id;
        this.Salary = Salary;
    }

    int getSalary() {
        return Salary;
    }

    @Override
    public int compareTo(Employee1 other) {
        return this.Name.compareTo(other.Name);
    }

    @Override
    public String toString() {
        return "Employee{" + "Name='" + Name + '\'' + ", Id=" + Id + ", Salary=" + Salary + '}';
    }
}

    class UsingStreamAPI {
        public static void main(String[] args) {
            Employee1 e1 = new Employee1("Ketan", 1, 130000);
            Employee1 e2 = new Employee1("Rahul", 2, 110000);
            Employee1 e3 = new Employee1("Milind", 3, 9000);
            Employee1 e4 = new Employee1("Aryash", 5, 6000);
            Employee1 e5 = new Employee1("Chaitanya", 4, 100000);

            List<Employee1> employeesList = Arrays.asList(e1, e2, e3, e4, e5);

            System.out.println("Before sorting: ");
            employeesList.forEach(System.out::println);

            // Calculate average salary using Map
            double averageSalary = employeesList.stream()
                    .collect(Collectors.averagingDouble(Employee1::getSalary));

            System.out.println("\nAverage Salary: " + averageSalary);

            // Print employees whose salary is greater than 10K
            System.out.println("\nEmployees with salary > 10K: ");
            employeesList.stream()
                    .filter(employee -> employee.getSalary() > 10000)
                    .forEach(System.out::println);
        }
    }

