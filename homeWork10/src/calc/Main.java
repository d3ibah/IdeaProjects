package calc;

import java.util.Scanner;

public class Main {
    int scan;                                           // переменная сканнера
    static int a, b;                                    // переменные аргументов
    static int deystvie;                                // переменная для выбора действия

    public static void main(String[] args) {
        System.out.println("Калькулятор выполняет арифметическую операцию с двумя числами.\n" +     // указываем условия
                "1 - сложение;\n" +
                "2 - вычитание;\n" +
                "3 - умножение;\n" +
                "4 - деление.\n" +
                "Введите число соответствующее требуемой операции:");
        Main main = new Main();
        deystvie = main.methScan();                     // переменной выбора действия присваиваем значение сканера
        boolean error = true;                           // для работы цикла вводим буллеан переменную
        while (error){                                  // в цикле запускаем ТРАЙ/КЭТЧ проверку
            try {
                main.move(deystvie);                    // если ошибок не будет выполниться метод МУВИ
                error = false;
            }
            catch (MyEx myEx){                          // если будет споймано исключение, то будет вызван метод гетРусМассаж класса МуЕх и заново запущен метод метСкан
                myEx.getRusMassage();
                error = true;
                main.methScan();
            }
        }

        main.vybor(deystvie);

    }

    public void vybor(int vyb){                         // в зависимости от того какая цифра была нажата срабатывает необходимый метод для арифметических действий
        switch (vyb){
            case (1):
                slozhenie();
                break;
            case (2):
                vychitanie();
                break;
            case (3):
                umnozhenie();
                break;
            case (4):
                delenie();
                break;
        }
    }

    public int methScan(){                              // метод сканирования
        Scanner scanner = new Scanner(System.in);
        scan = scanner.nextInt();
        return scan;
    }

    public void move(int deystvie) throws MyEx{         // метод с условием вызова исключения при обработке выбора арифметического действия
        if (deystvie != 1 && deystvie != 2 && deystvie != 3 && deystvie != 4) {
            throw new MyEx();
        }
    }

    public void zero(int b) throws MyEx{                // метод с условием вызова исключения при попытке поделить на нуль
        if(b == 0) {
            throw new MyEx();
        }
    }

    public void slozhenie(){                            // методы действий
        System.out.println("Текущее действие СЛОЖЕНИЕ.\nВведите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом сложения " + a + " и " + b + " будет - " + (a + b));;

    }
    public void vychitanie(){
        System.out.println("Текущее действие ВЫЧИТАНИЕ.\nВведите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом вычитания " + a + " и " + b + " будет - " + (a - b));;
    }
    public void umnozhenie(){
        System.out.println("Текущее действие УМНОЖЕНИЕ.\nВведите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;
        System.out.println("Результатом умножения " + a + " и " + b + " будет - " + (a * b));;;
    }
    public void delenie(){
        System.out.println("Текущее действие ДЕЛЕНИЕ.\nВведите первый аргумент и нажмите ENTER");
        methScan();
        a = scan;
        System.out.println("Введите второй аргумент и нажмите ENTER");
        methScan();
        b = scan;

        boolean error = true;                           // проверка на исключения при делении на нуль
        while (error){
            try {
                zero(b);
                error = false;
                }
            catch (MyEx myEx) {
                myEx.getExZero();
                error = true;
                methScan();
            }
        }
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

модернизировать калькулятор с использованием своих исключений.
выносите весь код расчетов в отдельный метод или класс и там при возникновении проблемы генерируете собственные исключения.
Cделать как минимум 2 исключения - одно например которое ловит ошибки некорректного ввода, а другое ошибки при расчете -
понятное дело что есть и стандартные но мы хотим свои + добавьте в свое исключение метод getRussianMessage что-бы можно было получить
описание ошибки на русском в методе main откуда все вызываете.
*/