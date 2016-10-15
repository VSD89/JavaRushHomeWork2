package com.javarush.test.level23.lesson13.big01;

import java.util.ArrayList;

public class Snake {
public ArrayList<SnakeSection> sections;
    public boolean isAlive;
    public SnakeDirection direction;

    public Snake(int x, int y) {
        SnakeSection head = new SnakeSection(x, y);
        sections = new ArrayList<SnakeSection>();
        sections.add(head);
        isAlive = true;
    }

    public ArrayList<SnakeSection> getSections() {
        return sections;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public SnakeDirection getDirection() {
        return direction;
    }

    public void setDirection(SnakeDirection direction) {
        this.direction = direction;
    }

    public int getX() {
        return sections.get(0).getX();
    }

    public int getY() {
        return sections.get(0).getY();
    }

    public void move() {}
}
