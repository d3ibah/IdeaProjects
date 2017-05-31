package Univer;

public class Student {


    public int age;
    public String name;
    double midlOcenka;
    public boolean isZaochnik;   // is - pered imenem Boolean peremennoy
    public static String nameUniver;

    public int getOcenkaCeloe(){
        return (int) midlOcenka;
    }

    public static String getUniverUpper() {
        return nameUniver.toUpperCase();
    }
}
