package org.example;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;
import org.json.JSONObject;
import org.json.XML;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

public class XMLtoJSONClass {

    public static void main(String[] args) throws IOException, JDOMException {
        String filePath = "src/main/resources/XMLSample.xml";
        //WebsiteClass website=deserializeXMLFile(filePath);
        //addAttributeToXML(filePath,"testAttribute", "testValue");
        JSONObject jsonObject= fromXMLtoJSON(filePath);

    }

    public static WebsiteClass deserializeXMLFile(String filePath) throws IOException {
        File xmlFile = new File(filePath);
        XmlMapper mapper = new XmlMapper();
        return mapper.readValue(xmlFile, WebsiteClass.class);

    }

    public static void addAttributeToXML(String filepath, String attributeName, String attributeValue) throws IOException, JDOMException {
        SAXBuilder saxBuilder = new SAXBuilder();
        Document document = saxBuilder.build(new File(filepath));
        Element rootElement = document.getRootElement();
        List<Element> children = rootElement.getChildren();
        rootElement.setAttribute(attributeName, attributeValue);
    }

    public static JSONObject fromXMLtoJSON(String filepath) throws IOException {
        File xmlFile = new File(filepath);
        String xmlContent= new String(Files.readAllBytes(xmlFile.toPath()));

        JSONObject jsonObject= XML.toJSONObject(xmlContent);
        return jsonObject;
    }

}
