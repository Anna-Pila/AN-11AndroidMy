package task6;

import task3.Person;

import java.util.*;

public class Main {

    @SafeVarargs
    static <T> Set<T> union(Set<T>... set) {
        Set<T> result = new HashSet<>();
        for (Set<T> unionSet : set) {
            result.addAll(unionSet);
        }
        return result;
    }

    @SafeVarargs
    static <T> Set<T> intersect(Set<T>... set) {
        Set<T> result = new HashSet<>(set[0]);
        for (Set<T> intersectSet : set) {
            result.retainAll(intersectSet);
        }
        return result;
    }


    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(7, 8, 9, 5);
        Set<Integer> set2 = Set.of(1, 2, 3, 7, 8, 9, 5);

        System.out.println("Список 1: " + set1 + "\nСписок 2: " + set2);
        System.out.println("Объединение: " + union(set1, set2));
        System.out.println("Пересечение: " + intersect(set1, set2));
    }
}
