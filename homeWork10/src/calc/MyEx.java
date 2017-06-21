package calc;

/**
 * Created by Пользователь on 18.06.2017.
 */
public class MyEx extends Exception {

    public static String exceptionMessageWrong = "Вы ввели не верный символ. Повторите выбор.\nКалькулятор выполняет арифметическую операцию с двумя числами.\n" +
            "1 - сложение;\n" +
            "2 - вычитание;\n" +
            "3 - умножение;\n" +
            "4 - деление.\n" +
            "Введите число соответствующее требуемой операции:";
    public static String exceptionZero = "Делить на НУЛЬ запрещено! Повторите ввод с начала";

    public static void getRusMassage() {
        System.out.println(exceptionMessageWrong);
    }

    public static void getExZero() {
        System.out.println(exceptionZero);
    }
}
