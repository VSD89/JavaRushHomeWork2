package com.javarush.test.level22.lesson18.big01;

public class Tetris {

    public static Tetris game;
    public Field field;
    public Figure figure;

    public Field getField() {
        return field;
    }

    public Figure getFigure() {
        return figure;
    }

    public void run(){}

    public void step(){}

    public static void main(String[] args) {
        game = new Tetris();
        game.run();
    }
}
