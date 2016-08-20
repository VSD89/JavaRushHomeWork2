package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());  //вводим с клавиатуры два числа
        if ((n1>0) && (n1%1==0) && (n2>0) && (n2%1==0)) {  //если оба числа целые и положительные - ищем НОД
            if (n2>n1)
                System.out.println(nod(n1, n2));
            else System.out.println(nod(n2, n1));
        }
    }
    public static int nod(int a, int b) {
        if (b%a==0) return a;
        else
            for (int i = a-1; i > 1 ; i--) {
                if ((a%i==0) && (b%i==0))
                    return i;
            }
        return 1;
    }
}
