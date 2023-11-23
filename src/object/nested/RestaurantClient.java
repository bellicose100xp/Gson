package object.nested;

import com.google.gson.Gson;
import utils.Util;

public class RestaurantClient {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "CA", "12345");
        Restaurant.Owner owner = new Restaurant.Owner("Mike", address);
        Restaurant.Staff cook = new Restaurant.Staff("John", 22, 10_000.0);
        Restaurant.Staff waiter = new Restaurant.Staff("Jane", 30, 8_000.0);
        Restaurant restaurant = new Restaurant("My Restaurant", owner, cook, waiter);

        String path = "data/restaurant.json";
        serializeRestaurantToJson(path, restaurant);

        Restaurant deserializedRestaurant = deserializeRestaurantFromJson(path);
        System.out.println(deserializedRestaurant);

        Address retrievedAddress = deserializedRestaurant.owner.address;
        System.out.print(retrievedAddress);
    }

    public static void serializeRestaurantToJson(String path, Restaurant restaurant) {
        Gson gson = new Gson();
        String json = gson.toJson(restaurant);
        Util.writeToFile(path, json);
    }

    public static Restaurant deserializeRestaurantFromJson(String path) {
        Gson gson = new Gson();
        String json = Util.readFromFile(path);
        return gson.fromJson(json, Restaurant.class);
    }
}
