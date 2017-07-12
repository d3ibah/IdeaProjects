package basepackage;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.IOException;

/**
 * Created by Home911 on 12.07.2017.
 */
public class SAXParserXML {

    public SAXParserXML() throws ParserConfigurationException, SAXException {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        SAXParser saxParser = spf.newSAXParser();
        XMLReader xmlReader = saxParser.getXMLReader();
        Shop shop = new Shop();
        xmlReader.setContentHandler(shop);
        try {
            xmlReader.parse("shop.xml");
        } catch (IOException e) {
            System.out.println("Ошибка открытия файла" + e.toString());
        }

    }
}
