package com.javarush.test.level16.lesson13.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Клубок
1. Создай 5 различных своих нитей c отличным от Thread типом:
1.1. нить 1 должна бесконечно выполняться;
1.2. нить 2 должна выводить "InterruptedException" при возникновении исключения InterruptedException;
1.3. нить 3 должна каждые полсекунды выводить "Ура";
1.4. нить 4 должна реализовать интерфейс Message, при вызове метода showWarning нить должна останавливаться;
1.5. нить 5 должна читать с консоли цифры пока не введено слово "N", а потом вывести в консоль сумму введенных цифр.
2. В статическом блоке добавь свои нити в List<Thread> threads в перечисленном порядке.
3. Нити не должны стартовать автоматически.
Подсказка: Нить 4 можно проверить методом isAlive()
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);
    static {
        threads.add(new InfinityThread());
        threads.add(new InterruptedThread());
        threads.add(new UraThread());
        threads.add(new MessageThread());
        threads.add(new NumberThread());
    }

    public static void main(String[] args) throws IOException {
//        MessageThread thread4 = (MessageThread) threads.get(3);
//        thread4.run();
//        thread4.showWarning();
//        try {
//            thread4.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
////        thread4.sleep(1000);
//        System.out.println(thread4.isAlive());
        Thread thread4 = threads.get(3);
        Message message = (Message) thread4;
        thread4.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        message.showWarning();
        System.out.println(thread4.isAlive());
    }

    public static class InfinityThread extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class InterruptedThread extends Thread {
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {}
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class UraThread extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static class MessageThread extends Thread implements Message {
        //        @Override
//        public void run() {
//            while (!isInterrupted()) {
//                System.out.println("sfsf");
//            }
//        }
//        @Override
//        public void showWarning() {
//            interrupt();
//            try {
//                join();
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//        }
//    }
        @Override
        public void run() {
            Thread current = Thread.currentThread();
            while(!current.interrupted()) {}
        }

        @Override
        public  void showWarning() {
            this.interrupt();
            try {
                this.join();
            } catch(Exception e) {}
        }
    }

    public static class NumberThread extends Thread {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int number;
        @Override
        public void run() {
            try {
                while (!isInterrupted()) {
                    s = reader.readLine();
                    if (s.equals("N")) {
                        System.out.println(number);
                        interrupt();
                    } else
                        number += Integer.parseInt(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
