package task5.two;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int[] mass = new int[15];
        Thread tMass = new Thread(new Mass(mass));
        Thread one = new Thread(new FirstAggregate(mass));
        Thread two = new Thread(new TwoAggregate(mass));
        tMass.start();
        one.start();
        two.start();
        two.join();
        one.join();

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}
