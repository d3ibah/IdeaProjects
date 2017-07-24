package model.shop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class Goods implements Comparable<Goods>{

    private int id;
    private String name;
    private String description;
    private Calendar year = Calendar.getInstance();
    //@JsonProperty("yearEperience")
    private int price;
    private boolean visible;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getYear() {
        return year;
    }

    public void setYear(String year) {
        //задаю формат даты
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.year.setTime(sdf.parse(year));
        } catch (ParseException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    @Override
    public String toString() {
        return "Employees{" + "id=" + id + ", name=" + name + ", description="
                + description + ", year = " + year.get(Calendar.DAY_OF_MONTH)
                + " " + (year.get(Calendar.MONTH)+1) + " "
                + year.get(Calendar.YEAR) + ", price="
                + price + "}\n";
    }

    //сортируем сотрудников по месяцу и дню рождения
    @Override
    public int compareTo(Goods o) {
        int result = year.get(Calendar.MONTH) - (o.year.get(Calendar.MONTH));
        if (result != 0) {
            return result;
        }

        result = year.get(Calendar.DAY_OF_MONTH) - (o.year.get(Calendar.DAY_OF_MONTH));
        if (result != 0) {
            return result;
        }

        return 0;
    }

}