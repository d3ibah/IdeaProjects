package file;

/**
 * Created by Пользователь on 19.06.2017.
 */
public class Student {

    private String name;
    private int age;
    private Boolean isZaochnik;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Boolean getZaochnik() {
        return isZaochnik;
    }

    public void setZaochnik(Boolean zaochnik) {
        isZaochnik = zaochnik;
    }
}
