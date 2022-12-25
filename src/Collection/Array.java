package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> stringList = new ArrayList<String>();
        stringList.add("nhan");
        stringList.add("ngoc");
        stringList.add("tara");
        stringList.add("ngan");
        stringList.add("ngoan");
        stringList.add("hien");
        stringList.add("khang");

        showList(stringList);
        System.out.println("Enter keyword: ");
        String key = scanner.nextLine();
        searchbyName(key,stringList);

        Collections.sort(stringList);
        for(String str: stringList) System.out.println(" "+str);
//                stringList.stream().sorted().toList();
//        sortedList.forEach(System.out::println);

        removeByName(key,stringList);
    }

    private static void removeByName(String key,List<String> stringList) {
        stringList.removeIf(str -> str.equals(key));
        System.out.println("remove success!");
//        System.out.println("List of people: " + stringList);
        showList(stringList);
    }

    //contains to search gan giong, equal la chinh xac
    private static void searchbyName(String key, List<String> stringList) {
        for (String str: stringList){
            if(str.contains(key)){
                System.out.println("ResultL: " + str);
            }

        }
    }

    private static void showList(List<String> stringList) {
        for (String str: stringList){
            System.out.println("List of people: " + str);
        }
    }

}
