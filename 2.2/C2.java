import netscape.javascript.JSObject;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class C2 {
    private String json;

    public C2(String json) {
        this.json = json;
    }

    public C2() {
        json = "";
    }

    public String getN1() throws ParseException {

        Object obj = new JSONParser().parse(json);
        JSONObject jo = (JSONObject) obj;

        return (String) jo.get("N1");
    }

    public String getN2() throws ParseException {

        Object obj = new JSONParser().parse(json);
        JSONObject jo = (JSONObject) obj;

        return (String) jo.get("N2");
    }

}
