package com.javarush.test.level14.lesson06.home01;

public class UkrainianHen extends Hen {
    public UkrainianHen() {
        System.out.println(getDescription());
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 20;
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
