package com.teachmeskills.hw.lesson_18.task2;

import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static void findStudentByLetter(String letter) {

        List<String> groupMembers = new ArrayList<>();
        groupMembers.add("Oleg");
        groupMembers.add("Dmitry");
        groupMembers.add("Dmitry");
        groupMembers.add("Sergey");
        groupMembers.add("Ilya");
        groupMembers.add("Kirill");
        groupMembers.add("Kirill");
        groupMembers.add("Igor");
        groupMembers.add("Marina");
        groupMembers.add("Daniil");
        groupMembers.add("Sultan");
        groupMembers.add("Rita");
        groupMembers.add("Vlad");
        groupMembers.add("Kate");

        //Выбрать все имена, начинающиеся на любую букву, введенную с консоли (вне зависимости от верхнего/нижнего регистра букв)
        System.out.println("Student with name starts with " + letter);
        groupMembers.stream()
                .filter(n -> n.startsWith(letter.toUpperCase()))
                .forEach(System.out::println);

        //Отсортировать и вернуть первый элемент коллекции
        System.out.print("First name of the sorted student list: ");
        groupMembers.stream()
                .sorted()
                .limit(1)
                .forEach(System.out::print);
    }
}
