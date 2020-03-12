package com.songj.factory.util;

import com.songj.factory.model.Fruit;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class FruitXmlUtil {
    private static final String FILE_NAME = "/factoryModel.xml";
    private static Document document = null;
    private static Map<String, Fruit> fruitMap = null;

    static {
        try {
            InputStream iso = FruitXmlUtil.class.getResourceAsStream(FILE_NAME);
            DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            document = builder.parse(iso);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Map<String, Fruit> getFruits() throws Exception {
        if(null == fruitMap){
            if(null == document){
                throw new Exception("xml解析异常");
            }
            fruitMap = new HashMap<>();
            NodeList parentNodeList = document.getElementsByTagName("list");
            NodeList childNodeList = parentNodeList.item(0).getChildNodes();
            for(int i = 0; i < childNodeList.getLength(); i++){
                if(childNodeList.item(i) instanceof Element){
                    Element element = (Element) childNodeList.item(i);
                    String className = element.getAttribute("class");
                    String type = element.getAttribute("type");
                    Fruit fruit = (Fruit) Class.forName(className).newInstance();
                    fruitMap.put(type, fruit);
                }
            }
        }
        return fruitMap;
    }

    public static String getFruitType() throws Exception {
        if(null == document){
            throw new Exception("xml解析异常");
        }
        NodeList nodeList = document.getElementsByTagName("fruit-type");
        Element element = (Element)nodeList.item(0);
        return element.getAttribute("value");
    }
}
