package basepackage;

/**
 * Created by Home911 on 28.06.2017.
 */
public class HomeThread extends Thread{
    @Override
    public void run() {
        int a = 1;
        int b = 10;
        while (b <= 100){
            Main.print10(this, a, b);
            a = a + 10;
            b = b + 10;
        }
    }
}
