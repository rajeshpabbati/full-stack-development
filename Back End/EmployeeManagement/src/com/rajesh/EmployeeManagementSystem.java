package com.rajesh;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Department: " + department + ", Salary: " + salary;
    }
}

class EmployeeManagement {
    private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(int id, String name, String department, double salary) {
        if (employees.containsKey(id)) {
            System.out.println("Employee ID already exists.");
            return;
        }
        employees.put(id, new Employee(id, name, department, salary));
        System.out.println("Employee added successfully.");
    }

    public void updateEmployee(int id, String name, String department, double salary) {
        if (!employees.containsKey(id)) {
            System.out.println("Employee ID not found.");
            return;
        }
        Employee emp = employees.get(id);
        emp.setName(name);
        emp.setDepartment(department);
        emp.setSalary(salary);
        System.out.println("Employee updated successfully.");
    }

    public void deleteEmployee(int id) {
        if (!employees.containsKey(id)) {
            System.out.println("Employee ID not found.");
            return;
        }
        employees.remove(id);
        System.out.println("Employee deleted successfully.");
    }

    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
            return;
        }
        for (Employee emp : employees.values()) {
            System.out.println(emp);
        }
    }

    public void searchEmployee(int id) {
        if (!employees.containsKey(id)) {
            System.out.println("Employee ID not found.");
            return;
        }
        System.out.println(employees.get(id));
    }
}

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagement em = new EmployeeManagement();

        while (true) {
            System.out.println("\nEmployee Management System");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Display All Employees");
            System.out.println("5. Search Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter Employee ID: ");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter Name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter Department: ");
                        String department = scanner.nextLine();
                        System.out.print("Enter Salary: ");
                        double salary = scanner.nextDouble();
                        em.addEmployee(id, name, department, salary);
                        break;
                    case 2:
                        System.out.print("Enter Employee ID: ");
                        id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Enter New Name: ");
                        name = scanner.nextLine();
                        System.out.print("Enter New Department: ");
                        department = scanner.nextLine();
                        System.out.print("Enter New Salary: ");
                        salary = scanner.nextDouble();
                        em.updateEmployee(id, name, department, salary);
                        break;
                    case 3:
                        System.out.print("Enter Employee ID: ");
                        id = scanner.nextInt();
                        em.deleteEmployee(id);
                        break;
                    case 4:
                        em.displayEmployees();
                        break;
                    case 5:
                        System.out.print("Enter Employee ID: ");
                        id = scanner.nextInt();
                        em.searchEmployee(id);
                        break;
                    case 6:
                        System.out.println("Exiting...");
                        scanner.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please try again.");
                scanner.nextLine();
            }
        }
    }
}