package com.company.bankomat;

public class UI{

    public void startUI(){

        Bankomat bankomat = new Bankomat();
        boolean isOK = bankomat.setMoney();
        bankomat.getMoney();
    }

    public static void onGetMoney(int money){
        if (money == 1 ){
            System.out.println("Операция не может быть выполнена. Не корректно указана сумма снятия");
        }
        else {
            System.out.println("Операция прошла успешно!");
        }
    }

    public static void onSetMoney(boolean isOK){
        if (isOK){
            System.out.println("Операция выполнена успешно. Деньги зачислены на счёт.");
        }
        else {
            System.out.println("Ошибка зачисления! Обратитесь в банк.");
        }
    }
}
