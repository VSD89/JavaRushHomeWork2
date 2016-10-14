package com.javarush.test.level22.lesson18.big01;

public class Figure {

    public int x;
    public int y;
    public int[][] matrix;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public void left() {
        x--;
    }
    public void right() {
        x++;
    }
    public void down() {
        y++;
    }
    public void up() {
        y--;
    }
    public void downMaximum() {}
    public void rotate() {}
    public boolean isCurrentPositionAvailable() {
        Field field = Tetris.game.getField();

        for (int i = 0; i < 3; i++)
        {
            for (int j = 0; j < 3; j++)
            {
                if (matrix[i][j] == 1)
                {
                    if (y + i >= field.getHeight())
                        return false;

                    Integer value = field.getValue(x + j, y + i);
                    if (value == null || value == 1)
                        return false;
                }
            }
        }

        return true;
    }
    public void landed() {}
}
