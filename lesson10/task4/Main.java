package task4;

import task3.Person;

import java.lang.reflect.Array;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<HeavyBox> heavyBoxTreeSet = new TreeSet<>();
        heavyBoxTreeSet.add(new HeavyBox("appleBoxTurkey/789",459));
        heavyBoxTreeSet.add(new HeavyBox("appleBoxPoland/1257",789));
        heavyBoxTreeSet.add(new HeavyBox("appleBoxChina/1256",125));

        for(HeavyBox  heavyBox : heavyBoxTreeSet){
            System.out.print(heavyBox.getId()+": ");
            System.out.println(heavyBox.getWeightBox()+" т");
        }
    }
}
