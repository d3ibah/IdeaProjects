package basepackage.Singleton;

/**
 * Created by Home911 on 26.06.2017.
 */
public class Singletone3 {

    public static class SingletoneHolder{
        public static final Singletone3 HOLDER_INSTANCE = new Singletone3();
    }

    public static Singletone3 getInstance(){
        return SingletoneHolder.HOLDER_INSTANCE;
    }
}
