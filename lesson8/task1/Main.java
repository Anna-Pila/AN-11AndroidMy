package task1;

class Utils {
    public static int random(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }
}

class CarException extends Exception {
    public CarException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("audi", 180, 45.4);
        Car bmw = new Car("bmv", 220, 200.4);
        Car hyundai = new Car("hyundai", 150, 100.4);
        try {
            audi.startEngine();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            bmw.startEngine();
        } catch (CarException e) {
            e.printStackTrace();
        }
        try {
            hyundai.startEngine();
        } catch (CarException e) {
            e.printStackTrace();
        }
    }
}
