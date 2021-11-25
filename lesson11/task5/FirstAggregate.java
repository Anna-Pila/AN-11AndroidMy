package task5.two;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class FirstAggregate implements Runnable {
    private int[] mass;
    int n = 0;

    public FirstAggregate(int[] list) {
        this.mass = list;
    }

    public int[] getList() {
        return mass;
    }

    public void setList(int[] list) {
        this.mass = list;
    }

    @Override
    public void run() {

        for (int i = 0; i < mass.length; i++) {
            try {
                synchronized (mass) {
                    n++;
                    mass.wait();
                }
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            Random random = new Random();
            mass[i] = random.nextInt(25);
//            mass[i] = 1;
        }

        System.out.println("Первый - " + n);
    }
}
