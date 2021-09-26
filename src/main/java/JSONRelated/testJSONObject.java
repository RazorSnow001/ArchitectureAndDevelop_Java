package JSONRelated;

import cn.hutool.json.JSONArray;
import cn.hutool.json.JSONObject;

public class testJSONObject {
    public static void main(String[] args) {
        JSONArray pets = new JSONArray();
        pets.put("cat");
        pets.put("dog");
        JSONObject person = new JSONObject();
        person.putOpt("name", "John Brown");
        person.putOpt("age", 35);
        person.putOpt("pets", pets);
        System.out.println(person);






    }


}
