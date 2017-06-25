package com.company.xml.models;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

public class ParsXml {

    public static void main(String[] arg){
        Document dom = null;
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            dom = db.parse("E:\\test\\test.xml");
        } catch (Exception e){
            System.out.println("Oshibka otkrytia faila" + e.toString());
            return;
        }
        Element root = dom.getDocumentElement();
        System.out.println("tag 1 = " + root.getTagName());

        NodeList nameNodeList = root.getElementsByTagName("name");
        Node nameNode = nameNodeList.item(0);
        System.out.println("tag 2 = " + nameNode.getNodeName());

        String name = nameNode.getFirstChild().getNodeValue();
        System.out.println("name = " + name);
    }
}
