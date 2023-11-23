package object.simple;

import com.google.gson.annotations.SerializedName;

public class CustomUser {
    @SerializedName(value = "full_name", alternate = {"name", "fullName"})
    private String fullName;
    private String name;

    @SerializedName("email_address")
    private String email;

    private int age;

    @SerializedName("is_developer")
    private boolean isDeveloper;

    public CustomUser(String name, String email, int age, boolean isDeveloper) {
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
