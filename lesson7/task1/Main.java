package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи строку");
        String myStr = in.nextLine();
        if (myStr.contains("A") && myStr.contains("B")) {
            int firstLetter = myStr.indexOf('A');
            int lastLetter = myStr.lastIndexOf('B');
            System.out.println("Индекс A - "+firstLetter + " Индекс B - " + lastLetter);
            System.out.println("Вывод не включая A и B");
            System.out.println(myStr.substring(firstLetter + 1, lastLetter));
            System.out.println("Вывод включая A и B");
            System.out.println(myStr.substring(firstLetter, lastLetter + 1));
        } else {
            System.out.println("Строка неверна!");
        }

    }

}
