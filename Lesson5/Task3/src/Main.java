import Jackets.Blouse;
import Jackets.Hoodie;
import Jackets.Jacket;
import Shoes.HighHills;
import Shoes.Shoes;
import Shoes.Trainers;
import Trousers.Jeans;
import Trousers.Pants;
import Trousers.Trousers;

public class Main {
    public static void main(String[] args) {
        Jacket blouse = new Blouse();
        Jacket hoodie = new Hoodie();

        Shoes highHills = new HighHills();
        Shoes trainers = new Trainers();

        Trousers jeans = new Jeans();
        Trousers pants = new Pants();

        Person men = new Person("Иванова Ивана Ивановича", hoodie, jeans, trainers);
        men.putOnClothes();
        System.out.println("________________________________________");
        men.startUndressing();
        System.out.println("________________________________________");
        Person women = new Person("Иванову Иванну Ивановну", blouse, pants, highHills);
        women.putOnClothes();
        System.out.println("________________________________________");
        women.startUndressing();

    }
}
