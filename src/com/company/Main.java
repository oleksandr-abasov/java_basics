// пакет
package com.company;

// импорты классов
import static java.lang.System.out;

// начало класса
public class Main {
    // статические поля (переменные) класса
    private static int NUMS = 100;

    // поля (переменные) класса
    // int a = 5
    // float b = 5.5

    // конструктор, если его нет, его компилятор создает по умолчанию, и он не делает ничего
    // Main() {}

    // методы класса

    // начало статического метода main
    public static void main(String[] args) {
        NUMS = 101;
        out.println(String.format("1 != 0 result %s", 1 != 0));
    }
    // конец метода main
}
// конец класса