package arrays;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import utils.Util;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MenuClient {
    public static void main(String[] args) {
        List<Menu.Item> menu = new ArrayList<>();
        menu.add(new Menu.Item("Pizza", 10.99));
        menu.add(new Menu.Item("Pasta", 8.99));
        menu.add(new Menu.Item("Salad", 7.99));

        serializeToJson("data/menu.json", menu);
        deserializeFromJson("data/menu.json");
    }

    private static void serializeToJson(String path, List<Menu.Item> menu) {
        Gson gson = new Gson();
        String json = gson.toJson(menu);
        Util.writeToFile(path, json);
    }

    private static void deserializeFromJson(String path) {
        Gson gson = new Gson();
        String json = Util.readFromFile(path);
        TypeToken<List<Menu.Item>> listType = new TypeToken<>() {};
        List<Menu.Item> menu = gson.fromJson(json, listType);
        System.out.println(menu);
    }
}
