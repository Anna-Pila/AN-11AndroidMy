package task4.two;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введи слово: ");
        String word = in.nextLine();
        new Thread(new IsPalindrome(word)).start();
    }
}
