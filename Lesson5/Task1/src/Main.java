public class Main {
    public static void main(String[] args) {
        PassengerCar passengerCar = new PassengerCar(150,220,233,
                "BMW x5",4, 10,"TrE-58",5);
        System.out.println("Автомобиль\n");
        passengerCar.print();
        passengerCar.maxKilometers(3);
        Cargo cargo = new Cargo(18,90,300,
                "VAZ-3000",4,8,458.26);
        System.out.println("____________________________________");
        System.out.println("Грузовик\n");
        cargo.print();
        cargo.printCapacity(459);
        Civil civil = new Civil(111000,1020,60,"Боинг-737",64,15,624,true);
        System.out.println("____________________________________");
        System.out.println("Пассажирский самолет\n");
        civil.print();
        civil.printCapacity(400);
        Military military = new Military(125000,1250,456,"World Peace",45,45,true,3);
        System.out.println("____________________________________");
        System.out.println("Военный самолет\n");
        military.print();
        military.printCapacity(2);
        System.out.print("Запуск катапульты: ");
        military.printCatapult();
    }
}
