package task5;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи последовательность цифр чпрез ',' ");
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] mass = input.trim().split("\\,");
        Set<String> hashSet = new HashSet<>();
        for (String hashSetAdd : mass) {
            hashSet.add(hashSetAdd.trim());
        }
        System.out.println(hashSet);
    }
}
