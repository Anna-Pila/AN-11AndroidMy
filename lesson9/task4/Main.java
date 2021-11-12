package task4;

import java.io.*;

class CarException extends Exception {
    public CarException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car audi = new Car("audi", 180, 45.4);
        Car bmw = new Car("bmv", 220, 200.4);
        Car hyundai = new Car("hyundai", 150, 100.4);
        try {
            audi.startEngine();
            bmw.startEngine();
            hyundai.startEngine();
        } catch (CarException e) {
            e.printStackTrace();
        }

//        FileOutputStream outputStream = new FileOutputStream("D:\\TMS\\Lesson9Home\\src\\task4\\Serialization.txt");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
//
//        // сохраняем игру в файл
//        objectOutputStream.writeObject(bmw);
//
//        //закрываем поток и освобождаем ресурсы
//        objectOutputStream.close();


        FileInputStream fileInputStream = new FileInputStream("D:\\TMS\\Lesson9Home\\src\\task4\\Serialization.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car savedCar = (Car) objectInputStream.readObject();

        System.out.println(savedCar);

    }
}
