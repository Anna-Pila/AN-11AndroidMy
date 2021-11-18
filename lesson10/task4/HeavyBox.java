package task4;

import java.util.Comparator;

public class HeavyBox implements Comparable<HeavyBox> {

    private String id;
    private int weightBox;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getWeightBox() {
        return weightBox;
    }

    public void setWeightBox(int weightBox) {
        this.weightBox = weightBox;
    }

    public HeavyBox(String id, int weightBox) {
        this.id = id;
        this.weightBox = weightBox;
    }


    @Override
    public int compareTo(HeavyBox o) {
        return o.getWeightBox() - weightBox;
    }
}
