package task2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    static boolean authorization(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        String pattern = "[a-zA-Z0-9_]{2,20}";
        boolean matches = Pattern.matches(pattern, login);
        if (!matches) {
            throw new WrongLoginException("Неверный логин");
        } else if (!(password.equals(confirmPassword))) {
            throw new WrongPasswordException("Пароли не совпадают!");
        } else {
            return true;
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
            System.out.println(authorization(login, password, confirmPassword));
        } catch (WrongLoginException | WrongPasswordException e) {
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
    }
}
