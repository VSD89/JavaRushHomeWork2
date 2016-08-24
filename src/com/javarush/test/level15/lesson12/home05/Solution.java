package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    private Solution(float f) {}

    private Solution(int i) {}

    private Solution(double d) {}

    Solution(int i, short h) {}

    Solution(String s, boolean b) {}

    Solution(String s, Integer j) {}

    protected Solution(int i, long l) {}

    protected Solution(int i, char c) {}

    protected Solution(byte b) {}

    public Solution(Float f) {}

    public Solution(Integer i) {}

    public Solution(Double d) {}
}

