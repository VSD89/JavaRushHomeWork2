package com.javarush.test.level22.lesson18.big01;

public class Field {
    public int width;
    public int height;
    public int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new int[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print((matrix[i][j] == 0)?".":"X");
            }
            System.out.println();
        }
    }

    public void removeFullLines() {}

    public Integer getValue(int x, int y) {
        return new Integer(x);
    }

    public void setValue(int x, int y, int value) {}



}
