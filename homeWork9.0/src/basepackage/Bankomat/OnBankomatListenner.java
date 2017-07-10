package basepackage.Bankomat;



public abstract class OnBankomatListenner {

    public abstract void onGetMoney(int money);
    public abstract void onSetMoney(boolean isOK);

}
