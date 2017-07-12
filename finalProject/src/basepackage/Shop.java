package basepackage;

import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;

/**
 * Created by Home911 on 12.07.2017.
 */
public class Shop extends DefaultHandler{
    private final String nameTag = "name";
    private final String locationTag = "location";
    private final String emailsTag = "emails";
    private final String goodsTag = "goods";
    private final String GoodsIdTag = "id";
    private final String GoodsNameTag = "name";
    private final String GoodsDescriptionsTag = "descriptions";
    private final String GoodsYearTag = "year";
    private final String GoodsPriceTag = "price";
    private final String GoodsVisibleTag = "visible";



}
