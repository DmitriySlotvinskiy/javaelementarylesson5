package com.slotvinskiy;

public class Robot {

    public int x;
    public int y;

    public Robot(int xCoordinate, int yCoordinate) {
        this.x = xCoordinate;
        this.y = yCoordinate;
    }

    public void increaseX() {
        if (this.x == Integer.MAX_VALUE) {
            return; // если текущая координата Х имеет МАХ значение, то не увеличиваем его
        }
        this.x++;
    }

    public void decreaseX() {
        if (this.x == Integer.MIN_VALUE) {
            return; // если текущая координата Х имеет МIN значение, то не уменьшаем его
        }
        this.x--;
    }

    public void increaseY() {
        if (this.y == Integer.MAX_VALUE) {
            return; // если текущая координата Y имеет МАХ значение, то не увеличиваем его
        }
        this.y++;
    }

    public void decreaseY() {
        if (this.y == Integer.MIN_VALUE) {
            return; // если текущая координата Y имеет МIN значение, то не уменьшаем его
        }
        this.y--;
    }

    public boolean isInStartPoint() {
        return x == 0 && y == 0;
    }
}
