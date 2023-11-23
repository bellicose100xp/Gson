package arrays;

import java.util.List;

public class Menu {
    private String name;
    private List<Item> items;

    public Menu(String name, List<Item> items) {
        this.name = name;
        this.items = items;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "name='" + name + '\'' +
                ", items=" + items +
                '}';
    }

    public static class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Item{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
