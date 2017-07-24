package model.parseFile;

import com.fasterxml.jackson.databind.ObjectMapper;
import controller.Controller;
import java.io.File;
import model.shop.Shop;

//используем библиотеку Jackson
public class ParseJson extends ParserThread {

    Shop shop = Shop.getInstance();

    @Override
    public void parse() {

        synchronized (this) {
            //спим
            view.View.print("ParserThread - спим");
            try {
                wait();
            } catch (InterruptedException ex) {
                view.View.print(ex.getMessage());
            }
        }

        //парсим
        view.View.print("ParserThread - парсим JSON");

        try {
            ObjectMapper mapper = new ObjectMapper();
            shop = mapper.readValue(new File("shop.json"), Shop.class);
            Controller.shop = shop;
        } catch (Exception ex) {
            view.View.print(ex.getMessage());
        }
        view.View.print("ParserThread - завершаем работу");
    }

}