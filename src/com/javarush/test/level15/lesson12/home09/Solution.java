package com.javarush.test.level15.lesson12.home09;

/* Парсер реквестов
Считать с консоли URl ссылку.
Вывести на экран через пробел список всех параметров (Параметры идут после ? и разделяются &, например, lvl=15).
URL содержит минимум 1 параметр.
Если присутствует параметр obj, то передать его значение в нужный метод alert.
alert(double value) - для чисел (дробные числа разделяются точкой)
alert(String value) - для строк

Пример 1
Ввод:
http://javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
Вывод:
lvl view name

Пример 2
Ввод:
http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo
Вывод:
obj name
double 3.14
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            s = reader.readLine();
            char ch = '?';
            int i = s.indexOf('?');
            String obj = "";
            String parameters[] = s.substring(i+1).split("&");
            for (int j = 0; j < parameters.length; j++) {
                String line = parameters[j];
                if (line.contains("obj=")) {
                    obj = line.substring(line.indexOf('=')+1);
                    line = line.substring(0, line.indexOf('='));
                    System.out.print(line + " ");
                }
                else if (line.contains("=")) {
                    line = line.substring(0, line.indexOf('='));
                    System.out.print(line + " ");
                }
                else System.out.print(line + " ");
            }
            if (!obj.isEmpty()) {
                System.out.println();
                if (isNumber(obj))
                    alert(Double.parseDouble(obj));
                else alert(obj);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

    public static boolean isNumber(String s) {
        if (s.length() == 0) return false;

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if ((i != 0 && c == '-') //есть '-' внутри строки
                    || (!Character.isDigit(c) && c != '-') ) { // не цифра и не начинается с '-'
                return false;
            }
        }
        return true;
    }
}
