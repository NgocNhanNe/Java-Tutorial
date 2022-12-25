package String;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter String: ");
        String str = scanner.nextLine();
        System.out.println("Enter Char: ");
        char ch = (char)System.in.read();

        CountChar(str,ch);
        CountTypeChar(str);
    }

    private static void CountTypeChar(String str) {
        int CountLower = 0;
        int CountUpper = 0;
        int CountNumber = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c >= 'a' && c <= 'z'){
                CountLower++;
            }
            if(c>='A'&&c<='Z'){
                CountUpper++;
            }
            if(c >= '0' && c <= '9'){
                CountNumber++;
            }
        }
        System.out.println("Number Lower" + CountLower);
        System.out.println("Number Lower" + CountUpper);
        System.out.println("Number Lower" + CountNumber);

    }

    private static void CountChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch){
                count++;
            }

        }
        System.out.println("The number appear of" + ch + "is:" + count);

    }
}
