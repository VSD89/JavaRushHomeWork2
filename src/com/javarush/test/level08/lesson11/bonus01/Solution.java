package com.javarush.test.level08.lesson11.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* Номер месяца
Программа вводит с клавиатуры имя месяца и выводит его номер на экран в виде: «May is 5 month».
Используйте коллекции.
*/

public class Solution
{
    public static void main(String[] args) throws IOException
    {
       ArrayList <String> az= new ArrayList<String>(); //напишите тут ваш код
        az.add("January");
        az.add("February");
        az.add("March");
        az.add("April");
        az.add("May");
        az.add("June");
        az.add("July");
        az.add("August");
        az.add("September");
        az.add("October");
        az.add("November");
        az.add("December");

        BufferedReader reader = new BufferedReader (new InputStreamReader (System.in));
        String s = reader.readLine();
        for (int i=0; i<az.size(); i++)
        {
            if (s.equals(az.get(i)))
                System.out.println(az.get(i)+" is "+(i+1)+" month");
        }

    }

}
