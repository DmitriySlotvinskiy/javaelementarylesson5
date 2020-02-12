package com.slotvinskiy;

//1. Есть поле из клеток посредине которого находится робот. Робот умеет выполнять 4 команды:
// двигаться на 1 клетку в сторону: R (right), L (left), U (up), and D (down).
//Задана строка из движений робота например "UUDLDR".
// Написать метод который вернет true если робот вернется в ту же клетку с которой начал.
//Input: "UD"
//Output: true
//
//Input: "LL"
//Output: false

public class Main {

    public static void main(String[] args) {

        String instruction = "LLLLRRRRRLUUDDUDUDRL";
        if (isBackInStartPoint(instruction)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    private static boolean isBackInStartPoint(String instruction) {
        Robot robot = new Robot(0, 0);
        char[] instructionsChar = instruction.toCharArray();
        for (int i = 0; i < instructionsChar.length; i++) {
            move(robot, instructionsChar[i]);
        }
        return robot.isInStartPoint();
    }

    private static void move(Robot robot, char direction) {
        switch (direction) {
            case 'U':
                robot.increaseY();
                break;
            case 'D':
                robot.decreaseY();
                break;
            case 'R':
                robot.increaseX();
                break;
            case 'L':
                robot.decreaseX();
                break;
            default:
                break;
        }

    }
}
