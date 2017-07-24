package controller;

import model.shop.Shop;
import model.downloadFile.DownloadFile;
import model.parseFile.ParseJson;
import model.parseFile.ParseXml;
import model.parseFile.ParserThread;
import model.sort.Sort;

import java.util.Scanner;

public class Controller {

    Scanner scan = new Scanner(System.in);
    public static Shop shop = Shop.getInstance();

    private static final String URL_XML = "http://kiparo.ru/t/shop.xml";
    private static final String URL_JSON = "http://kiparo.ru/t/shop.json";
    private static final String DOWNLOAD = "Выберите файл для скачки: 1 - XML, 2 - JSON";
    private static final String CYCLE = "Выберите дальнейшее действие: 1 - Вывод всех товаров,"
            + " 2 - вывод всех товаров 'Milk', 3 - вывод всех товаров с ценой больше 50, "
            + "4 - вывод первого товара, 5 - выход из программы";
    private static final String DATA = "Выберите поиск по дню - 1, "
            + "по месяцу - 2, по году - 3 или по дате - 4";

    public void startProject() {

        download();
    }

    //скачка и парсинг файла
    private void download() {
        DownloadFile downloadFile = new DownloadFile();
        ParserThread parserThread = null;
        boolean bool = true;
        do {
            view.View.print(DOWNLOAD);
            while (!scan.hasNextInt()) {
                view.View.print("Неправильный ввод");
                scan.next();
            }
            int scanInt = scan.nextInt();
            if (scanInt == 1) {
                parserThread = new ParseXml();
                downloadFile.setLink(URL_XML);
                bool = false;
            } else if (scanInt == 2) {
                parserThread = new ParseJson();
                downloadFile.setLink(URL_JSON);
                bool = false;
            }
        } while (bool);
        downloadFile.setParserThread(parserThread);
        parserThread.start();   //начинаем первым, потому что он спит изначально
        downloadFile.start();
        try {
            parserThread.join();
        } catch (InterruptedException ex) {
            view.View.print(ex.getMessage());
        }
        cycle();
    }

    //распечатка товаров
    private void printGoods() {
        view.View.print(shop);
    }

    //цикл выбора дальнейших действий
    public void cycle() {
        do {
            view.View.print(CYCLE);
            while (!scan.hasNextInt()) {
                view.View.print("Неправильный ввод");
                scan.next();
            }
            int scanInt = scan.nextInt();
            if (scanInt == 1) {
                //jubilee();
                Sort.sramasort(1);
            } else if (scanInt == 2) {
                //averAge();
                Sort.sramasort(2);
            } else if (scanInt == 3) {
                Sort.sramasort(3);
                //search();
            } else if (scanInt == 4) {
                //printEmployees();
                Sort.sramasort(4);
            } else if (scanInt == 5) {
                view.View.print("Программа завершена");
                return;
            }
        } while (true);
    }

}