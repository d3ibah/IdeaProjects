package basepackage;

/**
 * Created by Home911 on 26.06.2017.
 */
public class Singletone2 {

    private static Singletone2 instanse = new Singletone2();

    private Singletone2(){

    }

    public static Singletone2 getInstanse(){
        return instanse;
    }
}
