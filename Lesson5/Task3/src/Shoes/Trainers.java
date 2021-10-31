package Shoes;

public class Trainers implements Shoes{

    public Trainers() {
    }

    @Override
    public void putOn() {
        System.out.println("Кроссовки были надеты");
    }

    @Override
    public void takeOff() {System.out.println("Кроссовки были сняты"); }
}
