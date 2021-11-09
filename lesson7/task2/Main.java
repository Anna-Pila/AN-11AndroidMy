package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи строку");
        String myStr = in.nextLine();
        int lengthStr = myStr.length();
        if (lengthStr < 3) {
            throw new Exception("Длина меньше чем надо");
        } else {
            char element = myStr.charAt(0);
            char replaceElement = myStr.charAt(3);
            System.out.println("Элемент под индексом 0 - '" + element + "'");
            System.out.println("Элемент под индексом 3 - '" + replaceElement + "'");
            System.out.println("Замена всех '" + replaceElement + "' на '" + element + "'");
            final String newStr = myStr.replace(replaceElement, element);
            System.out.println(newStr);
        }
    }
}
