package Collection;

import java.util.ArrayList;
import java.util.List;

public class Homewok_ArrayList_1 {
    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(300.56);
        doubleList.add(600.88);
        doubleList.add(400.96);
        doubleList.add(500.73);
        doubleList.add(200.81);
        doubleList.add(100.60);
        doubleList.add(400.75);

        System.out.println(doubleList);
        double sum = 0;
        for (double item: doubleList) {
            sum += item;
        }
        System.out.println(sum);
    }
}
