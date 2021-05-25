import model.DataResponseModel;
import parser.Parser;
import repository.DataRepository;
import repository.impl.DataRepositoryImpl;

public class Main {

    public static void main(String[] args) {

        // Retrieving xml data from server
        DataRepository dataRepository = new DataRepositoryImpl();
        String xmlData = dataRepository.getXmlData();
        if (xmlData == null) {
            System.out.println("Error: Can not retrieve data from server");
            return;
        }
        // Parsing Xml to Java Model
        DataResponseModel responseModel = Parser.fromXmlToObject(xmlData, DataResponseModel.class);
        if (responseModel == null) {
            System.out.println("Error: Can not parse xml to DataResponseModel class");
            return;
        }

        // Parsing Xml to Json
        String json = Parser.fromXmlToJson(xmlData);
        if (json == null) {
            System.out.println("Error: Can not parse xml to json");
            return;
        }

        // Parsing Json to Xml
        String xml = Parser.fromJsonToXml(json);
        if (xml == null) {
            System.out.println("Error: Can not parse json to xml");
            return;
        }
        System.out.println("Great,,,, job is successfully parsed xml to json");
    }
}
