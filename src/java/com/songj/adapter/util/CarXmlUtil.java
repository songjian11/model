package com.songj.adapter.util;

import com.songj.adapter.car.Car;
import com.songj.adapter.car.Lamp;
import com.songj.adapter.car.Sound;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.InputStream;
import java.lang.reflect.Constructor;

public class CarXmlUtil {
    private final static String CAR_XML_PATH = "/car.xml";

    public static Car getCarBean() throws Exception {
        Car car = null;
        Sound sound = null;
        Lamp lamp = null;
        InputStream is = CarXmlUtil.class.getResourceAsStream(CAR_XML_PATH);
        DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = builderFactory.newDocumentBuilder();
        Document doc = documentBuilder.parse(is);
        NodeList nodeList = doc.getElementsByTagName("bean");
        for(int i=0; i < nodeList.getLength(); i++){
            if(nodeList.item(i) instanceof Element){
                Element element = (Element) nodeList.item(i);
                Class clazz = Class.forName(element.getAttribute("class"));
                Constructor constructor = clazz.getDeclaredConstructor(Sound.class, Lamp.class);
                constructor.setAccessible(true);
                NodeList childNodeList = element.getChildNodes();
                for(int j = 0; j < childNodeList.getLength(); j++){
                    if(childNodeList.item(j) instanceof Element){
                        Element childElement = (Element) childNodeList.item(j);
                        if("sound".equals(childElement.getAttribute("key"))){
                            sound = (Sound) Class.forName(childElement.getTextContent()).newInstance();
                        }
                        if("lamp".equals(childElement.getAttribute("key"))){
                            lamp = (Lamp) Class.forName(childElement.getTextContent()).newInstance();
                        }
                    }
                }
                car = (Car)constructor.newInstance(sound, lamp);
            }
        }
        return car;
    }
}
