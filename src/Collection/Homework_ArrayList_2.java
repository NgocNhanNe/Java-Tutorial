package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Homework_ArrayList_2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrListInteger = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("length of array: ");
        int len = Integer.parseInt(scanner.nextLine());
        int num;

        for(int i=0; i<len; i++){
            System.out.println("enter " + (i+1));
            num = scanner.nextInt();
            arrListInteger.add(num);
        }
        ArrayList<Integer> arrNewList = new ArrayList<>(arrListInteger.size());

        for (int str : arrListInteger) {
            if (!arrNewList.contains(str)) {
                arrNewList.add(str);
            }
        }
        System.out.print("List array 1: ");
        System.out.println(arrListInteger);
        System.out.print("\nList new: ");
        System.out.println(arrNewList);
    }
}
