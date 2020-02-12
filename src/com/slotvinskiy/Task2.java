package com.slotvinskiy;

//2. Написать метод который проверяет число простое или нет. Если нет вывести все его делители.

public class Task2 {

    public static void main(String[] args) {
        int n = 200;
        if (isSimple(n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    private static boolean isSimple(int n) {
        if (n == 2) {
            return true;
        }
        if (n < 2) {
            return false;
        }
        if (n % 2 == 0) {
            divideOnMultiplies(n);
            return false;
        }
        for (int i = 3; i < n; i += 2) {
            if (n % i == 0) {
                divideOnMultiplies(n);
                return false;
            }
        }
        return true;
    }

    private static void divideOnMultiplies(int n) {
        int divider = 2;
        System.out.print(n + " = ");
        while (n != divider) {
            if (n % divider == 0) {
                n = n / divider;
                System.out.print(divider + "*");
            } else {
                divider++;
            }
        }
        System.out.println(n);
    }

}
