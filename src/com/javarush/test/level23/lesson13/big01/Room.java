package com.javarush.test.level23.lesson13.big01;

public class Room {
    public int width, height;
    public Snake snake;
    public Mouse mouse;
    public static Room game;

    public Room(int width, int height, Snake snake) {
        this.width = width;
        this.height = height;
        this.snake = snake;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public Snake getSnake() {
        return snake;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSnake(Snake snake) {
        this.snake = snake;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void run() {}

    public void print() {}

    public static void main(String[] args) {
        game = new Room(10, 10, new Snake(2, 2));
        game.snake.setDirection(SnakeDirection.DOWN);
    }
}
