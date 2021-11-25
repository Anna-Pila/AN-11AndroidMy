package task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введи количество чисел: ");
        int count = in.nextInt();
        List<Integer> list = new ArrayList<>(count);
        for (int i = 0; i < count; i++) {
            System.out.print((i+1)+" число - ");
            list.add(in.nextInt());
        }
        System.out.println(list);

        final ExecutorService executor = Executors.newCachedThreadPool();
        final Future<Integer> maxFuture = executor.submit(new SearchMax(list));
        final Future<Integer> minFuture = executor.submit(new SearchMin(list));
        executor.shutdown();

        try {
            System.out.println("Минимальное число: " + minFuture.get());
            System.out.println("Максимальное число: " + maxFuture.get());
        } catch (InterruptedException | ExecutionException pE) {
            pE.printStackTrace();
        }
    }
}
