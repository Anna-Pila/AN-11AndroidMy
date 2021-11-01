package Shoes;

public class HighHills implements Shoes{

    public HighHills() {
    }

    @Override
    public void putOn() {
        System.out.println("Туфли на каблуке были надеты");
    }

    @Override
    public void takeOff() {System.out.println("Туфли на каблуке были сняты"); }
}
