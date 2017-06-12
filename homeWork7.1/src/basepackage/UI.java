package basepackage;

public class UI implements OnBankomatListenner{

    public void startUI(){

        // sniatie deneg
        Bankomat bankomat = new Bankomat();
        bankomat.setUi(this);

        // polozhit deneg
        boolean isOK = bankomat.setMoney();

        bankomat.getMoney();


    }


    public void onGetMoney(int money){
        /*switch (money){
            case (0):
                System.out.println("Udacha dengi polucheny!");
                break;
            case (1):
                System.out.println("Операция не может быть выполнена. Не корректно указана сумма снятия");
                break;
        }*/
        if (money == 1 ){
            System.out.println("Операция не может быть выполнена. Не корректно указана сумма снятия");
        }
        else {
            System.out.println("Udacha dengi polucheny!");
        }
    }

    public void onSetMoney(boolean isOK){
        if (isOK){
            System.out.println("Операция выполнена успешно. Деньги зачислены на счёт.");
        }
        else {
            System.out.println("Ошибка зачисления! Обратитесь в банк.");
        }
    }
}
