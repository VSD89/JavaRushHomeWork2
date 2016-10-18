package com.javarush.test.level18.lesson03.task04;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Самые редкие байты
Ввести с консоли имя файла
Найти байт или байты с минимальным количеством повторов
Вывести их на экран через пробел
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        FileInputStream inputStream = new FileInputStream(name);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> printList = new ArrayList<Integer>();
        int leastRepeating;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            list.add(data);
        }
        leastRepeating = Collections.frequency(list, list.get(0));
        for (int i : list) {
            int count = Collections.frequency(list, i);
            if (count < leastRepeating) leastRepeating = count;
        }
        for (int i : list) {
            int count = Collections.frequency(list, i);
            if ((count == leastRepeating) && (!printList.contains(i))) {
                printList.add(i);
            }
        }
        for (int i : printList) {
            System.out.print(i + " ");
        }
        reader.close();
        inputStream.close();
    }
}

