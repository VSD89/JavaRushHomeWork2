package com.javarush.test.level14.lesson06.home01;

public class BelarusianHen extends Hen {
    public BelarusianHen() {
        System.out.println(getDescription());
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 27;
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
