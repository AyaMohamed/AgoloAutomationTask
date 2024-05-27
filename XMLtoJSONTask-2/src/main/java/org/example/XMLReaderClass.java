package org.example;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class XMLReaderClass {


    //deserialize XML
    public static void readXMLFile(String filePath) throws IOException, JDOMException
    {
        //1. build XML doc.
        //2. get root element.
        //3. read each element under the root element.
        //4. get the value of each element.
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(new File(filePath));
        Element rootElement = document.getRootElement();
        List<Element> children = rootElement.getChildren();
        for (Element child : children) {
            //read each tag & its value
            System.out.println(child.getName() + ": " + child.getValue());
        }
    }

    public static void main(String[] args) throws IOException, JDOMException {


        String filePath = "src/main/resources/XMLSample.xml";

        readXMLFile(filePath);
    }
}
