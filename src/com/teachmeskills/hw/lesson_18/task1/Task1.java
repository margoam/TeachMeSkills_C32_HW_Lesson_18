package com.teachmeskills.hw.lesson_18.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Task1 {

    public static  void streamOperation (int numberOfElements){

        List<Integer> integerList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < numberOfElements; i++ ){
            integerList.add(random.nextInt(-20, 20));
        }

        System.out.println("Initial array is: " + integerList);

        //Удалить дубликаты
         List<Integer> distinctArrayValues = integerList.stream()
                 .distinct()
                 .toList();
        System.out.println("Distinct values of the array: ");
        distinctArrayValues.forEach(System.out::println);

        //Вывести все четные элементы в диапазоне от 7 до 17 (включительно)
        List<Integer> valuesInRange = integerList.stream()
                .filter(n -> n >= 7 && n <= 17)
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println("Even values in a n >= 7 && n <= 17 range of the array: ");
        valuesInRange.forEach(System.out::println);

        //Каждый элемент умножить на 2
        List<Integer> doubledArray = integerList.stream()
                .map(n -> n * 2)
                .toList();

        System.out.println("Multiplied values: ");
        doubledArray.forEach(System.out::println);

        //Отсортировать и вывести на экран первых 4 элемента
        List<Integer> sortedArray = integerList.stream()
                .sorted()
                .limit(4)
                .toList();

        System.out.println("First 4 values of the sorted list: ");
        sortedArray.forEach(System.out::println);

        //Вывести количество элементов в стриме
        System.out.println("List size is: " + integerList.stream().count());

        //Вывести среднее арифметическое всех чисел в стриме
        System.out.println("Arithmetic mean of numbers of the array: " +
                integerList.stream().mapToInt(n -> n).average().getAsDouble());
    }
}
