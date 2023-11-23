package object.nested;

import com.google.gson.Gson;
import utils.Util;

public class NestedUserClient {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");
        NestedUser nestedUser = new NestedUser("Mary", "mary@email.com", 65, false, address);

        String path = "data/nested_user.json";
        serializeToJson(path, nestedUser);

        NestedUser deserializedUser = deserializeFromJson(path);
        System.out.println(deserializedUser);
    }

    public static void serializeToJson(String path, NestedUser nestedUser) {
        Gson gson = new Gson();
        String json = gson.toJson(nestedUser);
        Util.writeToFile(path, json);
    }

    public static NestedUser deserializeFromJson(String path) {

        Gson gson = new Gson();
        String json = Util.readFromFile(path);
        return gson.fromJson(json, NestedUser.class);
    }
}
