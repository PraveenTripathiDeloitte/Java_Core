package practice;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Practice3 {

    public static void main(String[] args) {

        String regex = "[0-9a-zA-z](?i)DEL|BOM|BLR|CHE$";

        try {
            File xmlFile = new File("src/resources/data.xml");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = dbFactory.newDocumentBuilder();
            Document document = docBuilder.parse(xmlFile);
            document.getDocumentElement().normalize();

            System.out.println("Root element: " + document.getDocumentElement().getNodeName());
            NodeList nodeList = document.getElementsByTagName("account-details");
            System.out.println(nodeList);
            System.out.println("----------------------------------------------");

            for (int tmp = 0; tmp < nodeList.getLength(); tmp++) {
                Node node = nodeList.item(tmp);
                Element element = (Element) node;

                String tagElement = element.getElementsByTagName("bank-id").item(0).getTextContent();
                if (Pattern.compile(regex).matcher(tagElement).find())
                    System.out.println("Tag Element: " + tagElement);
            }

            System.out.println("\n");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }


        List<String> sample = new ArrayList<>();
        sample.add("123AQRBLR");
        sample.add("214W24MEX");
        sample.add("123423BOM");

        List<String> ans = new ArrayList<>();

        sample.forEach(item -> {
            if (Pattern.compile(regex).matcher(item).find()) {
                ans.add(item);
            }
        });
        System.out.println(ans);

        List<String> ans1 = sample.stream().filter(item -> Pattern.compile(regex).matcher(item).find()).collect(Collectors.toList());
        System.out.println(ans1);
    }
}
