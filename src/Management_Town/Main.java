package Management_Town;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter family number: ");
        int num_family = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < num_family; i++) {
            System.out.println("--------------------");
            System.out.print("Enter address: ");
            String address = scanner.nextLine();

            List<Person> personList = addNewPersonInFamily();
            town.addFamily(new Family(personList,address));
        }
        town.showInfor();
    }

    public static List<Person> addNewPersonInFamily(){
        Scanner scanner = new Scanner(System.in);
        List<Person> personList = new ArrayList<>();
        System.out.print("Enter member number: ");
        int member_num = Integer.parseInt(scanner.nextLine());
        for (int j = 0; j < member_num; j++) {
            System.out.println("--------------------");
            System.out.print("Enter personal id: ");
            double personal_id = Double.parseDouble(scanner.nextLine());

            System.out.print("Enter full name: ");
            String full_name = scanner.nextLine();

            System.out.print("Enter age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter career: ");
            String career = scanner.nextLine();

            Person person = new Person(personal_id, full_name, age, career);
            personList.add(person);
        }
        return personList;

    }


}
