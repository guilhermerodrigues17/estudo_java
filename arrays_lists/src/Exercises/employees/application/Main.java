package Exercises.employees.application;

import Exercises.employees.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many employees will be registered? ");
        int employeeRegistered = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i=0; i<employeeRegistered; i++){
            System.out.println();
            System.out.println("Employee #" + (i + 1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            employeeList.add(emp);

        }
        System.out.println();
        System.out.print("Enter the employee id will have the salary increase: ");
        int empIdSalary = sc.nextInt();
        Integer pos = position(employeeList, empIdSalary);

        if (pos == null){
            System.out.println("This id doesn't exist!");
        }
        else {
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            employeeList.get(pos).increaseSalary(percent);
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Employee emp: employeeList){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i=0; i< list.size(); i++){
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }
}
