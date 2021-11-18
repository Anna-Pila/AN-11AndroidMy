package task1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import static task1.Utils.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int countLesson = 0;
        Scanner in = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введи фио учеников");
        System.out.println("0 - закончить ввод");
        List<String> studentArrayList = new ArrayList<>();
        String fio = in.nextLine();
        while (!fio.equals("0")) {
            studentArrayList.add(fio);
            fio = in.nextLine();
        }
        Collections.sort(studentArrayList);
        printStudent(studentArrayList);
        System.out.println("введи количество уроков для заполнения");
        countLesson = in.nextInt();
        List<boolean[]> lessonList = new ArrayList<>();
        System.out.println("заполни журнал посещений");
        for (String student : studentArrayList) {
            System.out.println(student);
            boolean[] massMarkStudent = new boolean[countLesson];
            for (int j = 0; j < countLesson; j++) {
                System.out.println(j + 1 + " урок");
                massMarkStudent[j] = stringInBoolean(reader.readLine());
            }
            lessonList.add(massMarkStudent);
        }
        printVisitLog(studentArrayList,lessonList);

        String flag = in.nextLine();
        while (!flag.equals("exit")) {
            System.out.println("""
                    
                    Доступные действия:
                    'exit' : выход
                    + : добавление;
                    - : удаление;
                    @ - радактирование ФИО;
                    $ : радактирование отметки посящяемости
                    ///////////////////////////////""");

            flag = in.nextLine();
            switch (flag) {
                case "+" -> addStudent(studentArrayList, lessonList, countLesson);
                case "-" -> deleteStudent(studentArrayList, lessonList);
                case "@" -> updateStudentFio(studentArrayList, lessonList);
                case "$" -> updateLesson(studentArrayList, lessonList, countLesson);
            }
        }
    }
}

