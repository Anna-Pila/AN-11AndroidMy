package Trousers;

public class Pants implements Trousers{

    public Pants() {
    }

    @Override
    public void putOn() {
        System.out.println("Брюки были надеты");
    }

    @Override
    public void takeOff() {System.out.println("Брюки были сняты"); }

}
