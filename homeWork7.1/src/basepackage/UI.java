package basepackage;

public class UI implements OnBankomatListenner{

    public void startUI(){

        // sniatie deneg
        Bankomat bankomat = new Bankomat();
        bankomat.setUi(this);

        // polozhit deneg
        boolean isOK = bankomat.setMoney();

        bankomat.getMoney(70);


    }


    public void onGetMoney(int money){
        if (money >0 ){
            System.out.println("Udacha dengi polucheny!");
        }
        else {
            System.out.println("Oshibka, nedostatochno sredstv v kasse");
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
