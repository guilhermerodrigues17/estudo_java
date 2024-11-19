package employeeSalaryExercise_drills.application;

import employeeSalaryExercise_drills.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the file full path: ");
        String path = sc.nextLine();

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            List<Employee> employees = new ArrayList<>();

            while (line != null) {

                String[] fields = line.split(",");
                employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));

                line = br.readLine();
            }

            System.out.print("Enter salary: ");
            double salaryComparator = sc.nextDouble();

            //pipeline emails in natural order
            List<String> emails = employees.stream()
                    .filter(p -> p.getSalary() > salaryComparator)
                    .map(Employee::getEmail)
                    .sorted(String::compareTo)
                    .toList();

            System.out.printf("Email of people whose salary is more than %.2f:%n", salaryComparator);
            emails.forEach(System.out::println);

            //pipeline sum salary
            double sum = employees.stream()
                    .filter(p -> p.getName().charAt(0) == 'M')
                    .map(Employee::getSalary)
                    .reduce(0.0, Double::sum);

            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));

        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
