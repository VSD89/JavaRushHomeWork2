package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

public class Hippodrome {

    static ArrayList<Horse> horses = new ArrayList<Horse>();

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
        for (int i = 0; i < getHorses().size() ; i++) {
            getHorses().get(i).move();
        }
    }

    public void print() {
        for (int i = 0; i < getHorses().size() ; i++) {
            getHorses().get(i).print();
        }
        System.out.println();
        System.out.println();
    }

    public static Hippodrome game;

    public static void main(String[] args) {
        game = new Hippodrome();
        Horse Mashka = new Horse("Mashka", 3, 0);
        Horse Romashka = new Horse("Romashka", 3, 0);
        Horse Fast = new Horse("Fast", 3, 0);
        horses.add(Mashka);
        horses.add(Romashka);
        horses.add(Fast);
    }
}
