package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            ArrayList<Integer> num = new ArrayList<Integer>();
            Scanner sc = new Scanner(new File(reader.readLine()));
            int data;
            while(sc.hasNextInt()) { // возвращает истину, если с потока ввода можно считать целое число
                data = sc.nextInt(); //считывает целое число с потока ввода и сохраняет в переменную
                if (data%2==0)
                    num.add(data); //если число четное - добавляем в список
            }
            sc.close();
            Collections.sort(num);
            for (int i : num)
                System.out.println(i);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
