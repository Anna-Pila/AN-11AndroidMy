package task2;

public class SevenSecond implements Runnable {

    private Object second;
    private static int count = 0;

    public SevenSecond(Object second) {
        this.second = second;
    }

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (second) {
                try {
                    second.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count++;
            if (count == 7) {
                System.out.println("Прошло 7 секунд");
            } else if (count % 7 == 0) {
                System.out.println("Прошло еще 7 секунд");
            }
        }
    }
}
