package task2;

public class Chronometer implements Runnable{
    private Object second;

    public Object getSecond() {
        return second;
    }

    public void setSecond(Object second) {
        this.second = second;
    }

    public Chronometer(Object second) {
        this.second = second;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (second) {
                second.notifyAll();
            }
        }
    }
}
