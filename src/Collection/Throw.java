package Collection;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {
        System.out.println("Enter n");
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        check(n);
    }
    public static void check(int n){
        if(n<10){
            throw new ArithmeticException("n must be larger than 10");
        }
        else {
            System.out.println(n);
        }
    }
}
