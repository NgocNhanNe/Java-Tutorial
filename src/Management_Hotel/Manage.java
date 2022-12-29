package Management_Hotel;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manage {
    Scanner scanner = new Scanner(System.in);
    List<Guest> guestList = new ArrayList<>();

    List<Hotel> hotels = new ArrayList<>();

    public void menu(){
        while (true){
            System.out.println("Menu: \n1. Add new guest \n2. Delete guest \n3. Calculator \n4. Exit");
            System.out.println("***********************");
            System.out.print("Enter your choose: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1 ->{
                    System.out.println("Add new person");
                    System.out.println("-------------------");
                    addNewGuest();
                    addGuestIntoHotel(guestList);
                    show();
                }
                case 2 ->{
                    System.out.println("Delete person by personal id");
                    System.out.println("-------------------");
                    System.out.println("Enter personal id: ");
                    double personal_id = Double.parseDouble(scanner.nextLine());
                    deleteGuest(personal_id);
                    System.out.println(guestList);
                }
                case 3 ->{
                    System.out.println("Calculation");
                    System.out.println("-------------------");
                    System.out.println("Enter personal id: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Hotel hotel = addGuestIntoHotel(guestList);
                    int sum = calculator(id,hotel);
                    System.out.println("Price: "+sum);
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

    public List<Guest> addNewGuest(){

        System.out.println("Enter personal id: ");
        double personal_id = Double.parseDouble(scanner.nextLine());

        checkId(personal_id);
        System.out.println("Enter full name: ");
        String full_name = scanner.nextLine();

        System.out.println("Enter age: ");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter rent day number: ");
        int rentalDay_num = Integer.parseInt(scanner.nextLine());

        System.out.println("Choose a to rent room type A");
        System.out.println("Choose b to rent room type B");
        System.out.println("Choose c to rent room type C");
        String choose = scanner.nextLine();
        String type = null;
        switch (choose) {
            case "a" -> {
                type = "A";
                System.out.println("This room is 500");
            }
            case "b" -> {
                type = "B";
                System.out.println("This room is 300");
            }
            case "c" -> {
                type = "C";
                System.out.println("This room is 100");
            }
            default -> {
                System.out.println("type no");
            }
        }

        Guest guest = new Guest(personal_id,full_name,age, rentalDay_num, type);
        guestList.add(guest);

        return guestList;
    }

    public void checkId(double person_id){
        for (Guest guest: guestList) {
            if(guest.getPersonal_id() == person_id){
                System.out.println("enter again! Personal id is unique!");
            }
        }
    }

    public void deleteGuest(double personal_id){
        guestList.removeIf(guest -> guest.getPersonal_id() == personal_id);
    }

    public Hotel addGuestIntoHotel(List<Guest> guestList){
        Hotel hotel = new Hotel(guestList);
        hotels.add(hotel);
        return hotel;
    }

    public void show() {
        this.guestList.forEach(p -> System.out.println(p.toString()));
    }

    public int calculator(double personal_id, Hotel hotel) {
        int sum = 0;
        for (Guest guest: guestList) {
            if(guest.getPersonal_id() == personal_id){
                switch (guest.getCategory()) {
                    case "A" -> sum = guest.getRentDay_num() * 500;
                    case "B" -> sum = guest.getRentDay_num() * 300;
                    case "C" -> sum = guest.getRentDay_num() * 100;
                }
            }
        }
        return sum;
    }

}
