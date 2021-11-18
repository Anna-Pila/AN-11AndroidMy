package task1;

public class Car {
    private String brand;
    private int speed;
    private double price;

    public Car(String brand, int speed, double price) {
        this.brand = brand;
        this.speed = speed;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void startEngine() throws CarException {
        double random = Utils.random(0,20);
        System.out.println(random);
        if (random % 2==0) {
            throw new CarException("Машина сломана. Необходио отвезти на СТО");
        }
        else System.out.println("Автомобиль "+getBrand()+" завелся");
    }
}
