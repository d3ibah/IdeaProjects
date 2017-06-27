package basepackage;

import basepackage.InputData;

/**
 * Created by Home911 on 27.06.2017.
 */
public class USDAdapter extends InputData{

    public String getResult(){
        double resultD = getData() * 1.9221;
        resultD = resultD * 10000;
        int temp = (int)Math.round(resultD);
        resultD = (double)temp / 10000;
        String result = resultD + " BYR";
        return result;
    }
}
