package model.parseFile;

import java.util.TreeSet;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import model.shop.Goods;
import model.shop.Shop;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

//используем DOM-парсер
//System.out.println оставил для тестов
public class ParseXml extends ParserThread {

    //анонимный класс
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            parse();
        }
    });

    @Override
    public void parse() {

        synchronized (this) {
            //спим
            view.View.print("ParserThread - спит");
            try {
                wait();
            } catch (InterruptedException ex) {
                view.View.print(ex.getMessage());
            }
        }

        //парсим
        view.View.print("ParserThread - парсит XML");
        Shop shop = Shop.getInstance();
        Document dom = null;

        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.parse("shop.xml");
        } catch (Exception e) {
            view.View.print(e.getMessage());
            return;
        }

        //root
        Element root = dom.getDocumentElement();
//        System.out.println("tag = " + root.getTagName());
        //name
        shop.setName(getElement(root, "name"));
        //location
        shop.setLocation(getElement(root, "location"));

        //emails

        NodeList nodeList = root.getElementsByTagName("emails");
        for (int j = 0; j < nodeList.getLength(); j++) {
            Node node = nodeList.item(j);
//                System.out.print(node.getNodeName());
            String text = node.getTextContent();
//                System.out.println(" = " + text);
            shop.addEmails(text);
        }

        //goods
        NodeList goodssNodeList = root.getElementsByTagName("goods");

        TreeSet<Goods> set = new TreeSet<>();

        for (int i = 0; i < goodssNodeList.getLength(); i++) {
            Node goodssNode = goodssNodeList.item(i);

            if (goodssNode.getNodeType() != Node.ELEMENT_NODE) {
                continue;
            }

            Goods goods = new Goods();

//            System.out.println("======================================");

            Element element = (Element) goodssNode;

            //id
            goods.setId(Integer.parseInt(getElement(element, "id")));

            //name
            goods.setName(getElement(element, "name"));

            //degree
            goods.setDescription(getElement(element, "description"));

            //year
            goods.setYear(getElement(element, "year"));

            //yearExperience
            goods.setPrice(Integer.parseInt(getElement(element, "price")));

            //visible
            goods.setVisible(Boolean.parseBoolean(getElement(element, "visible")));

            set.add(goods);
        }
        shop.setGoods(set);
    }

    //получаем элемент по имени
    private static String getElement(Element element, String str) {
        Node node = element.getElementsByTagName(str).item(0);
//        System.out.print(node.getNodeName());
        String text = node.getTextContent();
//        System.out.println(" = " + text);
        return text;
    }

}