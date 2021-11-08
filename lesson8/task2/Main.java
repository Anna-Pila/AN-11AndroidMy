package task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    static boolean checkLogin(String login) throws WrongLoginException {
        String pattern = "[a-zA-Z0-9_]{2,20}";
        boolean matches = Pattern.matches(pattern, login);
        if (login == null || login.equals("")) {
            throw new WrongLoginException("Пустое значение");
        }
        if (!matches) {
            throw new WrongLoginException("Неверный логин");
        }
        return true;
    }

    static boolean checkPassword(String password, String confirmPassword) throws WrongPasswordException {

        if (password == null || password.equals("") || confirmPassword == null || confirmPassword.equals("")) {
            throw new WrongPasswordException("Пустое значение");
        }
        if (!(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароли не совпадают!");
        }
        return true;
    }

    static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        if ((checkLogin(login)) && (checkPassword(password, confirmPassword))) {
            return true;
        } else {
            return false;
        }
    }

    static class WrongLoginException extends Exception {
        WrongLoginException() {
        }

        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception {
        public WrongPasswordException() {
        }

        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException { //если работать по второму способу, throws нужен поэтому не удаляю

        Scanner in = new Scanner(System.in);
        System.out.println("Введи логин");
        String login = in.nextLine();
        System.out.println("Ваш логин:" + login);
        String password = "qwerty";
        System.out.println("Повтори пароль, который был сохранен ранее.");
        String confirmPassword = in.nextLine();
        try {
            authorization(login, password, confirmPassword);
            if (authorization(login, password, confirmPassword)) {
                System.out.println("Все верно!");
            }
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println("Ознакомься с ошибками !");
            e.printStackTrace();
        } //можно сделать вот так
//        catch (WrongLoginException ex){
//            ex.printStackTrace();
//            System.out.println("Логин был изменен");
//            login = "login";
//            System.out.println(authorization(login, password, confirmPassword));
//        }
//        catch (WrongPasswordException ex){
//            ex.printStackTrace();
//            System.out.println("Пароль был изменен на введенный");
//            password = confirmPassword;
//            System.out.println(authorization(login, password, confirmPassword));
//        }
        //еще 1 вариант реализации
//        try {
//            checkLogin(login);
//        } catch (WrongLoginException ex) {
//            ex.printStackTrace();
//        }
//        try {
//            checkPassword(password, confirmPassword);
//        } catch (WrongPasswordException ex) {
//            ex.printStackTrace();
//        } finally {
//            System.out.println("Error");
//        }
        in.close();
    }
}
