import java.util.Scanner;

public class Main {
    static int counter;

    public static void main(String[] args) {
        //Patient patient = new Patient(false,false,false,false);
        Patient patient = new Patient();
        TestCovid myTestCovid = new TestCovid(patient);
        Scanner in = new Scanner(System.in);
        System.out.println("Пациент носит маску?");
        boolean maskB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент болел Covid-19?");
        boolean covB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент работает дома?");
        boolean freeB = Utils.stringBool(in.nextLine());
        System.out.println("Пациент болен?");
        System.out.println(Utils.boolString(myTestCovid.test(maskB, covB, freeB)));
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
        } while ((nVaccine <= 0) || (nVaccine > counter));
        System.out.println("Пациент привился: " + Vaccine.values()[nVaccine - 1].getVaccineName() + "!");
    }
}
