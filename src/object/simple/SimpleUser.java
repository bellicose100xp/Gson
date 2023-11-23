package object.simple;

public class SimpleUser {
    private String name;
    private String email;
    private int age;
    private boolean isDeveloper;

    public SimpleUser(String name, String email, int age, boolean isDeveloper) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.isDeveloper = isDeveloper;
    }

    @Override
    public String toString() {
        return "object.simple.SimpleUser{"
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
                + '}';
    }
}
