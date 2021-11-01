package Trousers;

public class Jeans implements Trousers{
    public Jeans() {
    }

    @Override
    public void putOn() {
        System.out.println("Джинсы были надеты");
    }

    @Override
    public void takeOff() {System.out.println("Джинсы были сняты"); }
}
