package com.teachmeskills.hw.lesson_18;

import com.teachmeskills.hw.lesson_18.task1.Task1;
import com.teachmeskills.hw.lesson_18.task2.Task2;

import java.util.Scanner;

/**
 * Задача 1
 * Создать коллекцию класса ArrayList наполнить ее элементами рандомными элементами типа Integer.
 * С помощью Stream'ов:
 * - Удалить дубликаты
 * - Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
 * - Каждый элемент умножить на 2
 * - Отсортировать и вывести на экран первых 4 элемента
 * - Вывести количество элементов в стриме
 * - Вывести среднее арифметическое всех чисел в стриме
 * <p>
 * Задача 2
 * Создать коллекцию класса ArrayList со значениями имен всех студентов в группе
 * С помощью Stream'ов:
 * - Выбрать все имена, начинающиеся на любую букву, введенную с консоли (вне зависимости от верхнего/нижнего регистра букв)
 * - Отсортировать и вернуть первый элемент коллекции
 */
public class AppRunner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter an integer value for the Task1 (list size): ");
        int userInput = scanner.nextInt();
        Task1.streamOperation(userInput);

        System.out.print("Please enter a letter to find students: ");
        scanner.next();
        String letter = scanner.nextLine();
        Task2.findStudentByLetter(letter);
        scanner.close();
    }
}
