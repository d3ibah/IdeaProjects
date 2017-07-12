package basepackage;

/**
 * Created by Home911 on 12.07.2017.
 */
import java.util.ArrayList;

public class Root {

    private String name;
    private ArrayList<Shop> shop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Shop> getPeople() {
        return shop;
    }

    public void setPeople(ArrayList<Shop> people) {
        this.shop = people;
    }
}