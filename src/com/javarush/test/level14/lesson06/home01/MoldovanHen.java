package com.javarush.test.level14.lesson06.home01;

public class MoldovanHen extends Hen {
    public MoldovanHen() {
        System.out.println(getDescription());
    }
    @Override
    public int getCountOfEggsPerMonth() {
        return 24;
    }
    @Override
    public String getDescription() {
        return (super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
