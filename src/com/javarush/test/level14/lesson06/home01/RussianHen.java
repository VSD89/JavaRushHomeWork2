package com.javarush.test.level14.lesson06.home01;

public class RussianHen extends Hen {
    public RussianHen() {
        System.out.println(getDescription());
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 30;
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
