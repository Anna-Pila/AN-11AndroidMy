package task5.two;

public class Mass implements Runnable{
    private int[] mass;

    public Mass(int[] list) {
        this.mass = list;
    }
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (mass) {
                mass.notifyAll();
            }
        }
    }
}
