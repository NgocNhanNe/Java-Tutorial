package Management_Department;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Department_Manage {

    Scanner scanner = new Scanner(System.in);

    List<Department> departments = new ArrayList<>();

    public void menu(){
        while (true){
            System.out.println("Menu: \n1. Add new department \n2. Search \n3. Show all departments \n4. Exit");
            System.out.println("-------------------");
            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("-------------------");
                    System.out.println("Add new department");
                    addNewDepartment();
                }
                case 2 -> {
                    System.out.println("-------------------");
                    System.out.println("Search");
                    System.out.print("Enter keyword : ");
                    String key = scanner.nextLine();
                    search(key,departments);
                }
                case 3 -> {
                    System.out.println("-------------------");
                    System.out.println("Show all departments");
                    showListDepartments();
                }
                case 4 -> {
                    System.out.println("-------------------");
                    System.out.println("Update department");
                    System.out.print("Enter updated department  : ");
                    String name = scanner.nextLine();
                    UpdateDepartment(name, departments.listIterator().next());
                }
                case 5 -> System.exit(1);
                default -> System.out.println("Choose invalid!");
            }
        }
    }

    private void UpdateDepartment(String name, Department department) {
        for (int i=0; i<= departments.size();i++) {
            if (department.getFull_name().equals(name)) {
                System.out.println(department);
                departments.set(i, department);
                System.out.println(department.toString());
            }
        }

        System.out.println("No data!");
    }

    public void addNewDepartment(){
        //get int depart from entering
        System.out.println("Enter full name: ");
        String full_name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter gender: ");
        String gender = scanner.nextLine();

        System.out.println("Enter address: ");
        String address = scanner.nextLine();

        System.out.println("Please!Choose type of department: \n1. Worker \n2. Engineer \n3. Employee");
        System.out.println("-------------------");
        System.out.print("Enter your choose: ");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1 -> {
                System.out.print("Enter position: ");
                int position = Integer.parseInt(scanner.nextLine());
                Department department = new Worker(full_name,age,gender,address,position);
                departments.add(department);
            }
            case 2 -> {
                System.out.println("Enter training_industry: ");
                String training_industry = scanner.nextLine();
                Department department = new Engineer(full_name,age,gender,address,training_industry);
                departments.add(department);
            }
            case 3 -> {
                System.out.println("Enter job: ");
                String job = scanner.nextLine();
                Department department = new Employee(full_name,age,gender,address,job);
                departments.add(department);
            }
            default ->
                System.out.println("Choose invalid!");
        }

        System.out.println("Add new successfully!");

    }

    public void search(String name, List<Department> departments){
        for (Department department : departments) {
            if (department.getFull_name().equals(name)) {
                System.out.println(department);
            }
        }
        System.out.println("No data!");
    }

    public void showListDepartments(){
        for (Department department: departments) {
            System.out.println(department.toString());
        }

    }

}
