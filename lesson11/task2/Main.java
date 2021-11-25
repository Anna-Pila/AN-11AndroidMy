package task2;

public class Main {
    public static void main(String[] args) {
        Object counter = new Object();
        new Thread(new Chronometer(counter)).start();
        new Thread(new FiveSecond(counter)).start();
        new Thread(new SevenSecond(counter)).start();
    }
}
