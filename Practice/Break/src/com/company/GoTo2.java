package com.company;

public class GoTo2 {
    public static void main(String[] args) {
        outer: {
            for (int i = 0; i < 3; i++) {
                System.out.println("Итерация " + i);
                for (int j = 0; j < 100; j++) {
                    if (j == 10)
                        break outer;
                    System.out.print(j + " ");


                }
                System.out.println("Эта строка не будет выполняться");

            } System.out.println("Эта строка не будет выполняться");

        }System.out.println("Циклы завершены");
    }
}