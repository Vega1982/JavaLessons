package Lesson22;

import lombok.SneakyThrows;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

public class XMLWeatherParser {
    public XMLWeatherParser() {
    }

    @SneakyThrows
    public void parser() {
        // В общем, оно не работает. Я не могу вытащить конкретное значение температуры из XML-файла
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse("c:/temp/weather.xml");
        XPathFactory pathFactory = XPathFactory.newInstance();
        XPath xpath = pathFactory.newXPath();
        XPathExpression expr = xpath.compile("//current/temperature");
        NodeList nodes = (NodeList) expr.evaluate(document, XPathConstants.NODESET);

        Node n = nodes.item(0);
        System.out.println("Температура: " + n.getTextContent());

    }

}
