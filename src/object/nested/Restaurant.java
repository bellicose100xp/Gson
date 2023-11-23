package object.nested;

public class Restaurant {
    String name;
    Owner owner;
    Staff cook;
    Staff waiter;

    public Restaurant(String name, Owner owner, Staff cook, Staff waiter) {
        this.name = name;
        this.owner = owner;
        this.cook = cook;
        this.waiter = waiter;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", owner=" + owner +
                ", cook=" + cook +
                ", waiter=" + waiter +
                '}';
    }

    public static class Owner {
        String name;
        Address address;

        public Owner(String name, Address address) {
            this.name = name;
            this.address = address;
        }

        @Override
        public String toString() {
            return "Owner{" + "name='" + name + '\'' + ", address=" + address + '}';
        }
    }

    public static class Staff {
        String name;
        int age;
        double salary;

        public Staff(String name, int age, double salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Staff{" + "name='" + name + '\'' + ", age=" + age + ", salary=" + salary + '}';
        }
    }
}
