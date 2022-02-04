package Lesson22;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import lombok.SneakyThrows;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XMLWeatherParser {
    public XMLWeatherParser() {
    }

    @SneakyThrows
    public void parser() {
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse("c:/temp/weather.xml");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expr = xpath.compile("//current/temperature");
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);

//        Node n = nodes.item(2);
//        System.out.println("Температура: " + nodes.item(0).getTextContent());
        System.out.println("Температура: " + nodes.item(0).getNodeValue());

    }

}
