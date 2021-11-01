package Jackets;

public class Hoodie implements Jacket{
    public Hoodie() {
    }

    @Override
    public void putOn() {
        System.out.println("Худи было надето");
    }

    @Override
    public void takeOff() {System.out.println("Худи было снято"); }
}
