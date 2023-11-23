package arrays;

import com.google.gson.Gson;
import utils.Util;

public class FutureStudioClient {
    public static void main(String[] args) {
        deserializeFromJson();
    }

    private static void deserializeFromJson() {
        String json = Util.readFromFile("data/future-studio.json");
        FutureStudio futureStudio = new Gson().fromJson(json, FutureStudio.class);
        System.out.println(futureStudio);
    }
}
