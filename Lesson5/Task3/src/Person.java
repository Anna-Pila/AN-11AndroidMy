import Jackets.Jacket;
import Shoes.Shoes;
import Trousers.Trousers;

public class Person implements iPerson {
    private String name;
    private Jacket uJacket;
    private Trousers uTrousers;
    private Shoes uShoes;

    public Person(String name, Jacket uJacket, Trousers uTrousers, Shoes uShoes) {
        this.name = name;
        this.uJacket = uJacket;
        this.uTrousers = uTrousers;
        this.uShoes = uShoes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shoes getUShoes() {
        return uShoes;
    }

    public void setUShoes(Shoes uShoes) {
        this.uShoes = uShoes;
    }

    public Trousers getUTrousers() {
        return uTrousers;
    }

    public void setUTrousers(Trousers uTrousers) {
        this.uTrousers = uTrousers;
    }

    public Jacket getUJacket() {
        return uJacket;
    }

    public void setUJacket(Jacket uJacket) {
        this.uJacket = uJacket;
    }

    public void putOnClothes() {
        System.out.println("Одеваем "+ name);
        uJacket.putOn();
        uTrousers.putOn();
        uShoes.putOn();
    }

    public void startUndressing() {
        System.out.println("Раздеваем "+name);
        uJacket.takeOff();
        uTrousers.takeOff();
        uShoes.takeOff();
    }

}
