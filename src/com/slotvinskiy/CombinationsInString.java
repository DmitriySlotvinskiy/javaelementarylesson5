package com.slotvinskiy;

//4*. Написать рекурсивный(!!!) метод который выводит все перестановки строки.
//Например для строки abc: abc, acb, bac, bca, cab, cba

public class CombinationsInString {

    public static void main(String[] args) {

        String string = "123";
        printCombinations(string, 0, string.length());
    }

    private static void printCombinations(String string, int start, int end) {

        if (end - start == 1) {
            System.out.println(string);
        } else {
            for (int i = start; i < end; i++) {
                if (i != start) {
                    string = swap(string, start, i);
                }
                printCombinations(string, start + 1, end);
                if (i != start) {
                    string = swap(string, start, i);
                }
            }
        }
    }

    private static String swap(String string, int i, int j) {
        char[] temp = string.toCharArray();
        char fixChar = temp[i];
        temp[i] = temp[j];
        temp[j] = fixChar;
        return String.valueOf(temp);
    }
}
