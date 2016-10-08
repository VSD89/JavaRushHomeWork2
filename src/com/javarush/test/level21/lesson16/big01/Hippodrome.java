package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {

    public static Hippodrome game;

    private ArrayList<Horse> horses = new ArrayList<Horse>();

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void move() {
        for (Horse horse : getHorses()) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : getHorses()) {
            horse.print();
        }
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = getHorses().get(0);
        for (Horse horse : getHorses())
        {
            if (horse.getDistance() > winner.getDistance())
                winner = horse;
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        game = new Hippodrome();
        game.horses.add(new Horse("Mashka", 3, 0));
        game.horses.add(new Horse("Romashka", 3, 0));
        game.horses.add(new Horse("Fast", 3, 0));
        game.run();
        game.printWinner();
    }
}
