package com.company;

public class NestTry {
    //Пример применения вложенных операторов try

    public static void main(String[] args) {
        try{
            int a = args.length;
            /* Если не указаны аргументы командной строки, в следующем операторе будет сгенерировано
             исключение в связи с делением на нуль. */
            int b = 42 / a;
            System.out.println("a = " + a);

            try { // вложенный блок try. У него нет своего catch на случай нуля. только для выхода за пределы массива
                 /* Если указан один аргумент командной строки, то исключение в связи с делением на нуль
                 будет сгенерировано в следующем коде. */
                 if (a == 1)
                     a = a / (a-a); // деление на нуль
                /* Если указаны два аргумента командной строки, то генерируется исключение в связи
                с выходом за пределы массива. */
                if (a == 2){
                    int [] c = {1};
                    c[42] = 99; // здесь генерируется исключение в связи с выходом за пределы массива
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Индекс за пределами массива: " + e);
            }
        } catch (ArithmeticException e){
            System.out.println("Деление на ноль: " + e);
        }
    }
}

// Если во вложенном операторе try отсутствует оператор catch
//для перехвата и обработки конкретного исключения, стек развертывается, и проверяется
//на соответствие оператор catch из внешнего блока оператора try. И так
//до тех пор, пока не будет найден подходящий оператор catch или не будут исчерпаны
//все уровни вложенности операторов try.

// А если программа запускается на выполнение с одним
//аргументом, то исключение в связи с делением на нуль генерируется во вложенном
//блоке оператора try. Но поскольку это исключение не обрабатывается во вложенном
//блоке, оно передается внешнему блоку оператора try, где и обрабатывается.
//Если же программе передаются два аргумента командной строки, то во внутреннем
//блоке оператора try генерируется исключение в связи с выходом индекса
//за пределы массива.
