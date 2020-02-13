package com.slotvinskiy;

//3*. Написать метод. Входящие параметры: отсортированный массив и число.
//Метод должен вернуть true если это число есть в массиве, используя бинарный поиск.

// Я так понял Arrays.binarySearch(array, number) использовать нельзя....

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static final int ARRAY_SIZE = 20;
    public static final Random RANDOM = new Random();
    public static final int BOUND = 20;

    public static void main(String[] args) {

        int[] array = initSortedArray();
        int number = 0;
        if (isNumberInArray(array, number)) {
            System.out.println("There is number " + number + " in array: " + Arrays.toString(array));
        } else {
            System.out.println("There isn't number " + number + " in array: " + Arrays.toString(array));
        }
    }

    private static boolean isNumberInArray(int[] array, int number) {

        int start = 0;
        int end = array.length - 1;

        while (end - start != 1) {
            int middle = start + (end - start) / 2;
            if (array[middle] == number) {
                return true;
            } else if (number > array[middle]) {
                start = middle;
                continue;
            } else {
                end = middle;
            }
        }
        if (array[end] == number || array[start] == number) {
            return true;
        } else {
            return false;
        }
    }

    private static int[] initSortedArray() {
        int[] array = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            array[i] = RANDOM.nextInt(BOUND);
        }
        Arrays.sort(array);
        return array;
    }
}
