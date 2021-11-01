import java.util.Random;

public class SpaceX implements IStart {

    public SpaceX() {
    }

    @Override
    public boolean startingCheck() {
        Random random = new Random();
        int r = random.nextInt(10);
        if ((r < 7) && (r > 4)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели SpaceX запущены.\n" +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт SpaceX!");
    }
}
