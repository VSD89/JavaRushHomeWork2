package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        String fileName3 = reader.readLine();
        FileInputStream inputStream = new FileInputStream(fileName1);
        FileOutputStream outputStream2 = new FileOutputStream(fileName2);
        FileOutputStream outputStream3 = new FileOutputStream(fileName3);
        int av = inputStream.available();
        byte[] buffer2;
        byte[] buffer3;
        if (av%2==0) {
            buffer2 = new byte[av / 2];
            buffer3 = new byte[av / 2];
        } else {
            buffer2 = new byte[av / 2 + 1];
            buffer3 = new byte[av / 2];
        }
        while (inputStream.available() > 0) {
            outputStream2.write(buffer2, 0, inputStream.read(buffer2));
            outputStream3.write(buffer3, 0, inputStream.read(buffer3));
        }
        reader.close();
        inputStream.close();
        outputStream2.close();
        outputStream3.close();
    }
}
