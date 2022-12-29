package Management_ExamStudent;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    List<Student> studentList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void menu(){
        while (true){
            System.out.println("Menu: \n1. Add new student \n2. Show student in block \n3. Search student by id \n4. Exit");
            System.out.println("***********************");
            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 ->{
                    System.out.println("Add new student");
                    System.out.println("-------------------");
                    addNewStudent();
                }
                case 2 ->{
                    System.out.println("Show student in block");
                    System.out.println("-------------------");
                    showStudentInBlock(studentList);
                }
                case 3 ->{
                    System.out.println("Search student in block");
                    System.out.println("-------------------");
                    System.out.println("Enter student id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    searchStudentById(id,studentList);
                }
                case 4 ->{
                    System.exit(1);
                }
                default -> {
                    System.out.println("No choose!");
                }
            }
        }

    }

    private void searchStudentById(int id, List<Student> studentList) {
        for (Student student:studentList) {
            if(student.getStudent_id() == id){
                System.out.println(student);
            }
            else {
                System.out.println("no student!");
            }
        }
    }

    private void showStudentInBlock(List<Student> studentList) {
        for (Student student : studentList) {
                System.out.println(student);
        }
    }

    private void addNewStudent() {
            System.out.print("Enter student id: ");
            int student_id = Integer.parseInt(scanner.nextLine());
            checkIDUnique(student_id, studentList);

            System.out.print("Enter student name: ");
            String student_name = scanner.nextLine();

            System.out.print("Enter student address: ");
            String student_address = scanner.nextLine();

            System.out.println("Enter choose place: ");
            System.out.println("Places: \n1. KV1 \n2. KV2 \n3. KV3");
            int place = Integer.parseInt(scanner.nextLine());
            int priority_point;
            if(place == 1){
                priority_point = 3;
            }
            else if(place == 2){
                priority_point = 2;
            }
            else if(place == 3){
                priority_point = 1;
            }
            else {
                System.out.println("No place!");
                priority_point = 0;
            }

            System.out.println("Block: \n1. Block A \n2. Block B \n3. Block C");
            System.out.print("Enter choose block: ");
            int block = Integer.parseInt(scanner.nextLine());
            switch (block){
                case 1 ->{
                    System.out.print("Enter math point: ");
                    int math = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter chemistry point: ");
                    int chemistry = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter physical point: ");
                    int physical = Integer.parseInt(scanner.nextLine());

                    Student student_A = new Block_A(student_id,student_name,student_address,priority_point,math,chemistry,physical);
                    studentList.add(student_A);
                    System.out.println("Add new student in block A successfully!");
                    System.out.println(student_A);
                }
                case 2 ->{
                    System.out.print("Enter math point: ");
                    int math = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter chemistry point: ");
                    int chemistry = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter biological point: ");
                    int biological = Integer.parseInt(scanner.nextLine());

                    Student student_B = new Block_B(student_id,student_name,student_address,priority_point,math,chemistry,biological);
                    studentList.add(student_B);
                    System.out.println("Add new student in block B successfully!");
                    System.out.println(student_B);
                }
                case 3 ->{
                    System.out.print("Enter philology point: ");
                    int philology = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter historical point: ");
                    int historical = Integer.parseInt(scanner.nextLine());

                    System.out.print("Enter geographical point: ");
                    int geographical = Integer.parseInt(scanner.nextLine());

                    Student student_C = new Block_C(student_id,student_name,student_address,priority_point,geographical,philology,historical);
                    studentList.add(student_C);
                    System.out.println("Add new student in block C successfully!");
                    System.out.println(student_C);
                }
                default -> {
                    System.out.println("No block!");
                }
            }

    }


    private void checkIDUnique(int student_id, List<Student> studentList) {
        for (Student student: studentList) {
            if(student.getStudent_id() == student_id){
                System.out.println("ID is existed! Enter again!");
                addNewStudent();
            }
        }
    }

}
