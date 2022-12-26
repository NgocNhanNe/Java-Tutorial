package Collection;

import java.util.*;

public class Ex1_HashSetSort {
    public static void main(String[] args) {
        //hashSet
        HashSet<String> hashSet = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        String item;
        for (int i = 0; i <= len -1; i++) {
            item = scanner.nextLine();
            hashSet.add(item);
        }
        System.out.println("Hash set not sorted: "+hashSet);

        List<String> list = new ArrayList<String>(hashSet);
        Collections.sort(list);
        System.out.println("Hash set sorted: "+list);

        //sortedSet
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("e");
        sortedSet.add("c");
        sortedSet.add("w");
        sortedSet.add("y");
        sortedSet.add("h");
        sortedSet.add("a");
        sortedSet.add("e");
        System.out.println(sortedSet);

    }


}
