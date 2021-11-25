package task5.two;

import java.util.Random;

public class TwoAggregate implements Runnable {
    private int[] mass;

    public int[] getMass() {
        return mass;
    }

    public void setMass(int[] mass) {
        this.mass = mass;
    }

    public TwoAggregate(int[] list) {
        this.mass = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < mass.length; i++) {
            try {
                synchronized (mass) {
                    mass.wait();
                }
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            Random random = new Random();
            mass[i] = random.nextInt(5);
//            mass[i] = 2;
        }
    }
}
