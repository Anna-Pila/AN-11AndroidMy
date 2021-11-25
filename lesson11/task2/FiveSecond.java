package task2;

public class FiveSecond implements Runnable{

    private Object second;
    private static int count = 0;

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public FiveSecond(Object second) {
        this.second = second;
    }

    @Override
    public void run() {
        while (true) {
            try {
                synchronized (second) {
                    second.wait(1000);
                }
            } catch (InterruptedException pE) {
                pE.printStackTrace();
            }
            count++;
            if (count == 5) {
                System.out.println("Прошло 5 секунд");
            } else if (count % 5 == 0){
                System.out.println("Прошло еще 5 секунд");
            }
        }
    }
}
