package object.simple;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import utils.Util;

public class SimpleUserClient {
    public static void main(String[] args) {

        SimpleUser simpleUserToSerialize = new SimpleUser("John", "john@email.com", 27, true);
        serializeSimpleUser("data/simple_user.json", simpleUserToSerialize);

        SimpleUser simpleUserDeserialized = deserializeSimpleUser("data/simple_user.json");
        System.out.println(simpleUserDeserialized);
    }

    public static void serializeSimpleUser(String path, SimpleUser simpleUser) {
        Gson gson = new Gson();
        String json = gson.toJson(simpleUser);
        Util.writeToFile("data/simple_user.json", json);
    }

    public static SimpleUser deserializeSimpleUser(String path) {
        Gson gson = new Gson();
        String json = Util.readFromFile(path);
        return gson.fromJson(json, SimpleUser.class);
    }
}
