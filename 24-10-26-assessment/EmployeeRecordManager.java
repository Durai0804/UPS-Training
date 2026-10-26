
import java.util.*;
import java.io.*;

class Employee {
    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return "ID: " + id + ", Name: " + name +
               ", Department: " + department + ", Salary: " + salary;
    }
}

public class EmployeeRecordManager {

    static HashMap<Integer, Employee> employees = new HashMap<>();
    static String fileName = "emprecord.txt";

    // Load employee records from the file into HashMap
    static void loadEmployees() {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");

                int id = Integer.parseInt(data[0]);
                String name = data[1];
                String department = data[2];
                double salary = Double.parseDouble(data[3]);

                employees.put(id, new Employee(id, name, department, salary));
            }
        } catch (FileNotFoundException e) {
            System.out.println("No existing records found.");
        } catch (IOException | NumberFormatException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Error loading records: " + e.getMessage());
        }
    }

    // Save all employee records into a text file
    static void saveEmployees() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("emprecord.txt"))) {

            for (Employee emp : employees.values()) {
                bw.write(emp.id + "\t" + emp.name + "\t" +
                         emp.department + "\t" + emp.salary);
                bw.newLine();
            }

            System.out.println("Records saved successfully.");

        } catch (IOException e) {
            System.out.println("Error saving records.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        loadEmployees();

        while (true) {
            System.out.println("\n1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Update Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Display All");
            System.out.println("6. Save and Exit");

            System.out.print("Enter choice: ");

            try {
                int choice = Integer.parseInt(sc.nextLine());

                switch (choice) {

                    case 1:
                        // Add employee after checking duplicate ID
                        System.out.print("Enter ID: ");
                        int id = Integer.parseInt(sc.nextLine());

                        if (employees.containsKey(id)) {
                            System.out.println("Employee ID already exists.");
                            break;
                        }

                        System.out.print("Enter Name: ");
                        String name = sc.nextLine();

                        System.out.print("Enter Department: ");
                        String dept = sc.nextLine();

                        System.out.print("Enter Salary: ");
                        double salary = Double.parseDouble(sc.nextLine());

                        if (name.isBlank() || dept.isBlank() ||
                            !Double.isFinite(salary) || salary < 0) {
                            System.out.println("Invalid employee details.");
                            break;
                        }

                        employees.put(id, new Employee(id, name, dept, salary));
                        System.out.println("Employee added.");
                        break;

                    case 2:
                        // Search employee using ID
                        System.out.print("Enter ID: ");
                        id = Integer.parseInt(sc.nextLine());

                        Employee emp = employees.get(id);

                        if (emp != null)
                            System.out.println(emp);
                        else
                            System.out.println("Employee not found.");
                        break;

                    case 3:
                        // Update salary of an existing employee
                        System.out.print("Enter ID: ");
                        id = Integer.parseInt(sc.nextLine());

                        emp = employees.get(id);

                        if (emp != null) {
                            System.out.print("Enter New Salary: ");
                            salary = Double.parseDouble(sc.nextLine());

                            if (Double.isFinite(salary) && salary >= 0) {
                                emp.salary = salary;
                                System.out.println("Salary updated.");
                            } else {
                                System.out.println("Invalid salary.");
                            }
                        } else {
                            System.out.println("Employee not found.");
                        }
                        break;

                    case 4:
                        // Delete employee using ID
                        System.out.print("Enter ID: ");
                        id = Integer.parseInt(sc.nextLine());

                        if (employees.remove(id) != null)
                            System.out.println("Employee deleted.");
                        else
                            System.out.println("Employee not found.");
                        break;

                    case 5:
                        // Display all employees
                        if (employees.isEmpty()) {
                            System.out.println("No employee records.");
                        } else {
                            for (Employee e : employees.values()) {
                                System.out.println(e);
                            }
                        }
                        break;

                    case 6:
                        saveEmployees();
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid choice.");
                }

            } catch (NumberFormatException e) {
                System.out.println("Enter a valid number.");
            }
        }
    }
}
