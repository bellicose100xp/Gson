package arrays;

import java.util.List;

public class FutureStudio {
    private String name;
    private String website;
    List<Founder> founders;

    @Override
    public String toString() {
        return "FutureStudio{" +
                "name='" + name + '\'' +
                ", website='" + website + '\'' +
                ", founders=" + founders +
                '}';
    }
}
