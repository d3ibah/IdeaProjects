package model.shop;

import java.util.ArrayList;
import java.util.TreeSet;

public class Shop {

    private Shop() {
    }

    private static class SingletonHolder {
        private final static Shop SHOP = new Shop();
    }

    public static Shop getInstance() {
        return SingletonHolder.SHOP;
    }

    private String name;
    private String location;
    private ArrayList<String> emails = new ArrayList<>();
    private TreeSet<Goods> goods;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ArrayList<String> getEmails() {
        return emails;
    }

    public void addEmails(String email) {
        emails.add(email);
    }

    public TreeSet<Goods> getGoods() {
        return goods;
    }

    public void setGoods(TreeSet<Goods> goods) {
        this.goods = goods;
    }

    @Override
    public String toString() {
        return "Shop{" + "name=" + name + ", location=" + location
                + ", emails=" + emails + ", goods=\n" + goods + '}';
    }

}