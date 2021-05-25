package parser;

import com.google.gson.Gson;
import org.json.JSONObject;
import org.json.XML;

public class Parser {

    private static final int PRETTY_PRINT_INDENT_FACTOR = 4;

    public static <T> T fromXmlToObject(String xml, Class<T> type) {
        JSONObject json = XML.toJSONObject(xml);
        String jsonPrettyPrintString = json.toString(PRETTY_PRINT_INDENT_FACTOR);
        Gson gson = new Gson();
        T result = gson.fromJson(jsonPrettyPrintString, type);
        return result;
    }

    public static String fromXmlToJson(String xml) {
        JSONObject json = XML.toJSONObject(xml);
        String result = json.toString(PRETTY_PRINT_INDENT_FACTOR);
        return result;
    }

    public static String fromJsonToXml(String json) {
        JSONObject jsonObj = new JSONObject(json);
        String xml = XML.toString(jsonObj);
        return xml;
    }
}
