package bank;

import java.util.Scanner;

/**
 * Created by Home911 on 29.06.2017.
 */
public class Bankomat {
    private int count20 = 0;
    private int count50 = 0;
    private int count100 = 0;
    private final int NUM20 = 20;
    private final int NUM50 = 50;
    private final int NUM100 = 100;
    private int inkosacija;



    public void getMoney() {

        UI ui = new UI();

        System.out.println("Укажите сумму, которую хотите снять. Учитывайте, что банкомат хранит купюры " +
                "номиналом 20, 50 и 100.");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();                                               // вводим переменную, в которой будет храниться снимаемая сумма

        // прописываем логику снятия денег. начинаем с простых вариантов
        if (temp % 10 != 0 || temp == 30 || temp < 20 || temp > inkosacija) {     // указываем простые условия при которых выдача денег не возможна
            UI.onGetMoney(1);                                                     // передаём в onGetMoney значение "1", которое должно вызвать сообщение о не верно заданной сумме
        }
        else {
            while (temp <= inkosacija && temp / NUM100 > 0 && count100 > 0) {       // пишу циклы, где за один проход отнимается по 1 у счетчика купюр
                count100 = count100 - 1;
                temp = temp - NUM100;                                              // также на следующий проход уменьшается сумма которую необходимо снять с банкомата
            }
            while (temp < inkosacija && temp / NUM50 > 0 && count50 > 0) {
                count50 = count50 - 1;
                temp = temp - NUM50;
            }
            while (temp < inkosacija && temp / NUM20 > 0 && count20 > 0) {
                count20 = count20 - 1;
                temp = temp - NUM20;
            }
            inkosacija = NUM20 * count20 + NUM50 * count50 + NUM100 * count100;
            ui.onGetMoney(0);
            System.out.println("На счету осталось: " + inkosacija + ", наминалом 20 - " + count20 + "шт, наминалом 50 - "
                    + count50 + "шт, наминалом 100 - " + count100 + " шт.");
        }

    }

    public boolean setMoney() {
        System.out.println("Для работы программы нужно указать количество купюр номиналом 20, 50 и 100." +
                "\nВведите количество купюр номиналом 20:\t");
        Scanner scanner = new Scanner(System.in);
        count20 = count20 + scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 50:\t");
        count50 = count50 + scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 100:\t");
        count100 = count100 + scanner.nextInt();
        inkosacija = NUM20 * count20 + NUM50 * count50 + NUM100 * count100;
        System.out.println("Сейчас в банкомате храниться:" + inkosacija);

        UI.onSetMoney(true);

        return false;
    }


}