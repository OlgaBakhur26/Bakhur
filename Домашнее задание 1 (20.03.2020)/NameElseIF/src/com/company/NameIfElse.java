package com.company;
import java.util.Scanner;

public class NameIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.print("Введите свое имя: ");
        String UserName = scanner.nextLine();
        String name1 = "Вася";
        String name2 = "Анастасия";

            if (UserName.equals(name1)) {
                System.out.println("Привет!");
                System.out.println("Я тебя так долго ждал.");
            } else if (UserName.equals(name2))
                System.out.println("Я тебя так долго ждал.");
            else
                System.out.println("Добрый день, а вы кто?");
    }
}
