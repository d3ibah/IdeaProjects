package com.example.homework01;

public class homework01 {
    public static void main (String[] args) {
        System.out.println("Задача номер 1.");
        // Создайте переменную типа String c любым текстом (не сильно короткое).
        // Далее выведите на экран количество символов в данной строке.
        // Далее разделите строку пополам (если ровно поделить не выходит то +-1 не страшно),
        // в результате у вас должно быть 2-е новых переменных типа String с частями из
        // изначальной строки. Полученные строки выведите на экран.
        String text1 = "Создайте переменную типа String c любым текстом (не сильно короткое).";
        int lenghttext = text1.length();
        System.out.println("В заданной строке " + lenghttext + " символов");
        int sizepart = lenghttext / 2;
        String part1 = text1.substring(0, sizepart);
        System.out.println("Разбив предложение на две части мы получили первую часть: " + part1);
        String part2 = text1.substring(sizepart);
        System.out.println("\nИ вторую часть: " + part2);
        System.out.println("------------------------");



        System.out.println("Задача номер 2.");
        // Создайте любое число. Определите, является ли последняя цифра числа семеркой.
        int x = (int)(Math.random()*10000);
        System.out.println("Число для анализа " + x);
        if (x % 10 % 7 == 0){
            System.out.println("В числе " + x + " последняя цифра является семёркой");
        }
        else {
            System.out.println("В числе " + x + " последняя цифра не является семёркой");
        }
        System.out.println("------------------------");

        System.out.println("Задача номер 3.");
        // Имеется прямоугольное отверстие размерами a и b (размеры задать любые),
        // определить, можно ли его полностью закрыть круглой картонкой радиусом r
        // (тоже подставляем любое значение).
        int a, b, r;
        a = (int)(Math.random()*100);
        b = (int)(Math.random()*100);
        r = (int)(Math.random()*100);
        System.out.println("В заданном прямоугольнике сторона \"а\" имеет размер " + a + "см, " +
                "а сторона \"b\" " + b + "см.\nКартонка, которой будем накрывать прямоугольник " +
                "имеет радиус " + r + "см.\nКруг сможет накрыть прямоугольник в том случае, если " +
                "его диаметр будет больше диагонали прямоугольника.");
        double d = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // находим диагональ
        System.out.println ("Диагональ прямоугольника = " + d + " см");
        if (d < 2 * r) {
            System.out.println("Круглая картонка сможет закрыть прямоугольное отверстие");
        }
        else {
            System.out.println("Круглая картонка не сможет закрыть прямоугольное отверстие");
        }
        System.out.println("------------------------");

        System.out.println("Задача номер 4.");
        // Имеется целое число (любое), это число — сумма денег в рублях. Вывести это число,
        // добавив к нему слово «рублей» в правильном падеже.
        int y = (int)(Math.random() * 1000);
        System.out.println("Задано число " + y);
        String y1 = " рубль";
        String y2 = " рубля";
        String y3 = " рублей";
        if (y % 100 == 1){
            System.out.println(y + y1);
        }
        if (y % 100 >= 2 && y % 100 <= 4) {
            System.out.println(y + y2);
        }
        if (y % 100 >= 5)
            if (y % 100 <= 20) {
            System.out.println(y + y3);
            }
            else if (y % 10 == 1) {
                System.out.println(y + y1);
            }
            else if (y % 10 >= 2 && y % 10 <= 4) {
                System.out.println(y + y2);
            }
            else if (y % 10 >=5 && y % 10 <= 9) {
                System.out.println(y + y3);
            }
        if (y % 10 == 0) {
            System.out.println(y + y3);
        }
        System.out.println("------------------------");

        System.out.println("Задача номер 5.");
        // Имеется строка, которая содержит символы ? и символы #.
        // Замените все символы ? на HELLO, а # - удалите. Результат вывести на экран.
        String anyonetext = "??##?????###???#??#####";
        String newAnyonetext = anyonetext.replace("?", "HELLO");
        String anyonetext1 = newAnyonetext.replace("#", "");
        System.out.println(anyonetext1);


    }


}
