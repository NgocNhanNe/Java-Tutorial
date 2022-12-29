package Management_Book;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    List<Borrow_Card> borrow_cards = new ArrayList<>();
    List<Student> studentList = new ArrayList<>();

    public void menu(){
        while (true) {
            System.out.println("Menu: \n1. Add new borrow card \n2. Delete borrow card by id \n3. Show all cards \n4. Exit");
            System.out.println("-------------------");
            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1 -> {
                    System.out.println("Add new borrow card");
                    System.out.println("-------------------");
                    Student student = addNewStudent();
                    Borrow_Card borrow_card = addStudentCard(student);
                    System.out.println(borrow_card);
                }
                case 2 -> {
                    System.out.println("-------------------");
                    System.out.println("Delete borrow card by id");
                    System.out.print("Enter id : ");
                    int id = Integer.parseInt(scanner.nextLine());
                    deleteCard(id);
                }
                case 3 -> {
                    System.out.println("-------------------");
                    System.out.println("Show all cards");
                    showListCard();

                }
                case 4 -> System.exit(1);
                default -> System.out.println("Choose invalid!");
            }
        }
    }

    private void showListCard() {
        for (Borrow_Card card: borrow_cards) {
            System.out.println(card);
        }
    }

    private void deleteCard(int id) {
        borrow_cards.removeIf(card -> card.getCard_id() == id);
        System.out.println("delete successfully!");
    }

    public Student addNewStudent(){
        System.out.println("Enter full name: ");
        String full_name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter class id: ");
        String class_id = scanner.nextLine();

        Student student = new Student(full_name,age,class_id);
        studentList.add(student);

        return student;
    }

    public Borrow_Card addStudentCard(Student student){
        System.out.println("Enter card id: ");
        int card_id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter borrow day: ");
        String borrow_day = scanner.nextLine();
        Date borrowDay = stToDate(borrow_day);

        System.out.println("Enter deadline day: ");
        String deadline_day = scanner.nextLine();
        Date deadlineDay = stToDate(deadline_day);

        System.out.println("Enter book id: ");
        int book_id = Integer.parseInt(scanner.nextLine());

        Borrow_Card borrow_card = new Borrow_Card(card_id,borrowDay,deadlineDay,book_id, student);
        borrow_cards.add(borrow_card);
        return borrow_card;
    }

    public Date stToDate(String date){
        Date datetime = null;
        SimpleDateFormat sm = new SimpleDateFormat("dd-MM-yyyy");
        try{
            datetime=sm.parse(date);
        }catch (ParseException e){
            System.out.println("invalid");
        }
        return datetime;
    }
}
