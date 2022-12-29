package Collection;

import java.util.Scanner;

public class Exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a: ");
        int a = Integer.parseInt(scanner.nextLine());
        System.out.println("enter b: ");
        int b = Integer.parseInt(scanner.nextLine());
        try{
            int sum = a + b;
            System.out.println("sum: " + sum);
            int sub = a - b;
            System.out.println("sub: " + sub);
            int mul = a * b;
            System.out.println("mul: " + mul);
            int div = a / b;
            System.out.println("div: " + div);
        }
        catch (ArithmeticException e){
            System.out.println("number is invalid!");
        }
        finally {
            System.out.println("this is finally block");
        }

    }
}
