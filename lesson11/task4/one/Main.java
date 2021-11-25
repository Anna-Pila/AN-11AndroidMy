package task4.one;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введи слово: ");
        String word = in.nextLine();
        final ExecutorService executor = Executors.newCachedThreadPool();
        final Future<String> isPalindrome = executor.submit(new IsPalindrome(word));
        executor.shutdown();

        try {
            System.out.println(word + " - " + isPalindrome.get());
        } catch (InterruptedException | ExecutionException pE) {
            pE.printStackTrace();
        }
    }
}
