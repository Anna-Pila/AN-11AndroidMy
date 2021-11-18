package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Utils {

    static boolean stringInBoolean(String str) {
        return str.equals("+");
    }

    static String[] booleanInString(boolean... bool) {
        String[] str = new String[bool.length];
        for (int i = 0; i < bool.length; i++) {
            if (bool[i]) {
                str[i] = "+";
            } else {
                str[i] = "-";
            }
        }
        return str;
    }

    static void printStudent(List<String> studentArrayList) {
        System.out.println("///////////////////////////////");
        System.out.println("Список студентов");
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.print("№" + (i + 1) + ") ");
            System.out.println(studentArrayList.get(i));
        }
        System.out.println("///////////////////////////////");
    }

    static void printVisitLog(List<String> studentArrayList, List<boolean[]> lessonList) {
        System.out.println("///////////////////////////////");
        System.out.println("ЖУРНАЛ ПОСЕЩЕНИЙ");
        for (int i = 0; i < studentArrayList.size(); i++) {
            System.out.print((i + 1) + ") " + studentArrayList.get(i) + " : ");
            System.out.println("\t" + Arrays.toString(booleanInString(lessonList.get(i))));
        }
        System.out.println("///////////////////////////////");
    }


    static void addStudent(List<String> studentArrayList, List<boolean[]> lessonList, int countLesson) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("Добавление студента\nвведи ФИО");

        String addStudent = in.nextLine();
        studentArrayList.add(addStudent);
        System.out.println("Заполни посещения нового ученика");
        System.out.println("Введи +/-");
        boolean[] addMarkStudent = new boolean[countLesson];
        for (int i = 0; i < countLesson; i++) {
            System.out.println(i + 1 + " урок");
            addMarkStudent[i] = stringInBoolean(reader.readLine());
        }
        lessonList.add(addMarkStudent);
        System.out.println("////////////////Добавление прошло успешно////////////////");
        printVisitLog(studentArrayList, lessonList);
    }

    static void deleteStudent(List<String> studentArrayList, List<boolean[]> lessonList) {
        if (studentArrayList.size() == 0) {
            System.out.println("Список учеников пуст");
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("Введи номер студента которого нужно удалить ");
            int delete = in.nextInt();
            studentArrayList.remove(delete - 1);
            lessonList.remove(delete - 1);
            System.out.println("////////////////Удаление прошло успешно////////////////");
            if (studentArrayList.size() == 0) {
                System.out.println("Список учеников пуст");
            } else {
                printVisitLog(studentArrayList, lessonList);
            }
        }
    }

    static void updateStudentFio(List<String> studentArrayList, List<boolean[]> lessonList) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("Введи номер студента который необходимо изменить");
        int updateNumber = in.nextInt();
        if (updateNumber > studentArrayList.size() || updateNumber < 1) {
            System.out.println("Под данным номером нет студента. Введи номер от 1 до " + studentArrayList.size());
        } else {
            System.out.println("Введи ФИО");
            String updateFio = reader.readLine();
            studentArrayList.set(updateNumber - 1, updateFio);
            System.out.println("////////////////Изменение ФИО прошло успешно////////////////");
            printVisitLog(studentArrayList, lessonList);
        }
    }

    static void updateLesson(List<String> studentArrayList, List<boolean[]> lessonList, int countLesson) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner in = new Scanner(System.in);
        System.out.println("Изменить посещяемость");
        System.out.println("Введи номер студента");
        int updateNumber = in.nextInt();
        if (updateNumber > studentArrayList.size() || updateNumber < 1) {
            System.out.println("Под данным номером нет студента. Введи номер от 1 до " + studentArrayList.size());
        } else {
            System.out.println("Введите номер урока который необходимо изменить");
            int updateNumberLesson = in.nextInt();
            if (updateNumberLesson > countLesson || updateNumberLesson < 1) {
                System.out.println("Под данным номером нет урока. Введи номер урока от 1 до " + countLesson);
            } else {
                System.out.println("Введи +/-");
                boolean updateLesson = stringInBoolean(reader.readLine());
                lessonList.get(updateNumber - 1)[updateNumberLesson - 1] = updateLesson;
                System.out.println("////////////////Измение посещяемости прошло успешно////////////////");
                printVisitLog(studentArrayList, lessonList);
            }
        }
    }
}
