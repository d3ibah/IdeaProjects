package basepackage;

import java.util.Scanner;

public class Main {
    int scan;
    static int a, b;
    static double result;

    public static void main(String[] args) {
        System.out.println("Калькулятор выполняет арифметическую операцию с двумя числами.\n" +
                "1 - сложение;\n" +
                "2 - вычитание;\n" +
                "3 - умножение;\n" +
                "4 - деление.\n" +
                "Введите число соответствующее требуемой операции:");
        Main main = new Main();
        main.methScan();
        switch (main.scan){
            case (1):
                main.slozhenie();
                break;
            case (2):
                main.vychitanie();
                break;
            case (3):
                main.umnozhenie();
                break;
            case (4):
                main.delenie();
                break;
        }
    }

    public int methScan(){
        Scanner scanner = new Scanner(System.in);
        scan = scanner.nextInt();
        return scan;

    }
    public void slozhenie(){
        System.out.println("Текущее действие СЛОЖЕНИЕ.\n Введите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом сложения " + a + " и " + b + " будет - " + (a + b));;

    }
    public void vychitanie(){
        System.out.println("Текущее действие ВЫЧИТАНИЕ.\n Введите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом вычитания " + a + " и " + b + " будет - " + (a - b));;
    }
    public void umnozhenie(){
        System.out.println("Текущее действие УМНОЖЕНИЕ.\n Введите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом умножения " + a + " и " + b + " будет - " + (a * b));;;
    }
    public void delenie(){
        System.out.println("Текущее действие ДЕЛЕНИЕ.\n Введите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        double result = ((double)(a / b));
        System.out.println("Результатом деления " + a + " и " + b + " будет - " + result);;;
    }
}

/*
1. Делаем вот это задание:
калькулятор в консоли, который будет складывать, отнимать, умножать и делить числа, и выводить результат.
Числа вводить в консоли и проверять на корректность + проверять во время операций сложения, вычитания и тд.
Выбор оператора (+, -  и т. д.) можно спрашивать у пользователя в виде:
- введите 1, что-бы сложить 2 числа
- введите 2, что-бы умножить 2 числа
- и т. д.

 */
