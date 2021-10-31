package Jackets;

public class Blouse implements Jacket{
    public Blouse() {
    }

    @Override
    public void putOn() {
        System.out.println("Блузка была надета");
    }

    @Override
    public void takeOff() {System.out.println("Блузка была снята"); }
}
