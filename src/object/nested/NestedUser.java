package object.nested;

import object.nested.Address;

public class NestedUser {
    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;
    private Address address;

    public NestedUser(String name, String email, int age, boolean isDeveloper, Address address) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
        this.address = address;
    }

    @Override
    public String toString() {
        return "object.nested.NestedUser{"
                + "name='"
                + name
                + '\''
                + ", email='"
                + email
                + '\''
                + ", age="
                + age
                + ", isDeveloper="
                + isDeveloper
                + ", address="
                + address
                + '}';
    }
}
