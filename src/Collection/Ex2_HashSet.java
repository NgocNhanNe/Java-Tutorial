package Collection;

import java.util.*;

public class Ex2_HashSet {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String item;
        for (int i = 0; i < n; i++) {
            item = scanner.nextLine();
            arrayList.add(item);
        }
        System.out.println("Array List: "+ arrayList);

        HashSet<String> hashSet = new HashSet<>(arrayList);
        System.out.println("Hash set: "+ hashSet);

    }


}
