package basepackage;

import java.util.Scanner;

/**
 * Created by Home911 on 27.06.2017.
 */
public class InputData implements InputDataInterface {

    @Override
    public double getData() {
        System.out.println("Введите сумму USD для конвертации:");
        Scanner scanner = new Scanner(System.in);
        double usd = scanner.nextDouble();
        return usd;
    }
}
