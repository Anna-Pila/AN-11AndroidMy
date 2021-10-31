import java.util.Random;

public class Shuttle implements IStart {

    public Shuttle() {
    }

    @Override
    public boolean startingCheck() {
        Random random = new Random();
        int r = random.nextInt(10);
        if (r > 3) {
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Двигатели Шатла запущены.\n" +
                "Все системы в норме.");
    }

    @Override
    public void start() {
        System.out.println("Старт Шатла!");
    }
}
