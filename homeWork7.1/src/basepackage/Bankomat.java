package basepackage;

import java.util.Scanner;

public class Bankomat {
    private int count20 = 0;       // budet 2 publ metoda - vziat dengi i dat dengi
    private int count50 = 0;
    private int count100 = 0;
    private final int NUM20 = 20;
    private final int NUM50 = 50;
    private final int NUM100 = 100;
    private OnBankomatListenner ui;

    public void setUi(OnBankomatListenner ui) {
        this.ui = ui;
    }

    public void getMoney(int value){

        System.out.println("Укажите сумму, которую хотите снять. Учитывайте, что банкомат  купюры " +
                "номиналом 20, 50 и 100.\n");
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        System.out.println(temp);



        // если нужно снять 70 руб, то нужно сделать
        //count20 = count20 - 1;
        //count50 = count50 - 1;
        // рогресс - длительное ожидание
        //return 0;

        ui.onGetMoney(value);
    }

    public boolean setMoney(){
        System.out.println("Для работы программы нужно указать количество купюр номиналом 20, 50 и 100.\n" +
                "Введите количество купюр номиналом 20:\t");
        Scanner scanner = new Scanner(System.in);
        count20 = count20 + scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 50:\t");
        count50 = count50 + scanner.nextInt();
        System.out.println("Введите количество купюр номиналом 100:\t");
        count100 = count100 + scanner.nextInt();

        System.out.println("Сейчас в банкомате храниться:" + (NUM20 * count20 + NUM50 * count50 + NUM100 * count100));
        // если нужно положить 100 руб, то нужно сделать
        //count20 = count100 + 1;

        ui.onSetMoney(true);

        return false;
    }


}