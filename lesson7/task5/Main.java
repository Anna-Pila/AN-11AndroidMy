package task5;

import java.util.Scanner;

public class Main {
    static int counter ;

    public static void main(String[] args) {
        //Patient patient = new Patient(false,false,false,false);
        Scanner in = new Scanner(System.in);
        System.out.println("Введи имя Пациента");
        String nameP = in.nextLine();
        Patient patient = new Patient(nameP);
        TestCovid myTestCovid = new TestCovid(patient);
        System.out.println("Пациент носит маску?");
        boolean maskB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент болел Covid-19?");
        boolean covB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент работает дома?");
        boolean freeB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент болен?");
        boolean mTestCovid = myTestCovid.test(maskB, covB, freeB);
        System.out.println(Utils.boolString(mTestCovid));
        System.out.println("Антитела");
        System.out.println(myTestCovid.antibodies(maskB, covB, freeB));
        System.out.println("_________________________________________________");
        System.out.println("Какой вакциной пациент хочет привиться?");
        for (Vaccine vaccine : Vaccine.values()) {
            counter++;
            System.out.println(vaccine.ordinal() + 1 + " - " + vaccine.name());
        }

        int nVaccine;
        do {
            System.out.println("Выбери номер от 1 до " + counter);
            while (!in.hasNextInt()) {
                System.out.println("Ты ввел символ! Введи число!");
                in.next();
            }
            nVaccine = in.nextInt();
        } while ((nVaccine <= 0) || (nVaccine>counter));

        System.out.println("Информация по пациенту зафиксирована! \nДля "+ nameP + " - '" + Vaccine.values()[nVaccine - 1].getVaccineName() + "' !");

        Message message = new Message(patient,mTestCovid);
        message.myMessage();
    }
}
