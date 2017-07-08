package basepackage;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.util.ArrayList;

public class Main extends DefaultHandler {

    String thisElement = "";
    ArrayList<People> list = new ArrayList<>();
    People peop;
    Root root = new Root();
    boolean skipName = false;

    public static void main(String[] args) {
        Main mainSax = new Main();
        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser parser = factory.newSAXParser();
            parser.parse("test.xml", mainSax);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }

        mainSax.root.setPeople(mainSax.list);
        System.out.println(mainSax.root);
    }

    @Override
    public void startDocument() {
        System.out.println("Start document\n");
    }

    @Override
    public void endDocument() {
        System.out.println("\nEnd document\n");
    }

    @Override
    public void startElement(String uri, String name, String qName, Attributes atts) {
        if (qName.equals("element")) {
            peop = new People();
        }
        thisElement = qName;
        System.out.println("Start element: " + qName);
    }

    @Override
    public void endElement(String uri, String name, String qName) {
        if (qName.equals("element")) {
            list.add(peop);
        }
        thisElement = "";
        System.out.println("End element: " + qName);
    }

    @Override
    public void characters(char ch[], int start, int length) {
        if (ch[start] == '\n') {
            System.out.println("");
        } else {
            System.out.print("Characters:    \"");
            for (int i = start; i < start + length; i++) {
                switch (ch[i]) {
                    case ' ':
                        System.out.print("");
                        break;
                    case '\n':
                        System.out.print("\\n");
                        break;
                    default:
                        System.out.print(ch[i]);
                        break;
                }
            }
            System.out.print("\"\n");
        }

        switch (thisElement) {
            case "age":
                peop.setAge(Integer.parseInt(new String(ch, start, length)));
                break;
            case "id":
                peop.setId(Integer.parseInt(new String(ch, start, length)));
                break;
            case "isDegree":
                peop.setIsDegree(Boolean.parseBoolean(new String(ch, start, length)));
                break;
            case "name":
                if (skipName) {
                    peop.setName(new String(ch, start, length));
                } else {
                    root.setName(new String(ch, start, length));
                    skipName = true;
                }
                break;
            case "surname":
                peop.setSurname(new String(ch, start, length));
                break;
        }
    }
}
