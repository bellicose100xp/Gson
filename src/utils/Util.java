package utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Util {
    public static void main(String[] args) {

        String s = readFromFile("data/test.json");
        System.out.println(s);
        writeToFile("data/out/test-out.json", s);
    }

    public static String readFromFile(String srcPath) {
        Path path = Paths.get(srcPath);
        String text = null;

        try {
            text = Files.readString(path);
        } catch (IOException e) {
            System.out.println("Error reading from file " + srcPath + ": " + e.getMessage());
        }

        return text;
    }

    public static void writeToFile(String dstPath, String content) {
        Path path = Paths.get(dstPath);

        /* Create directory if it doesn't exist */
        if (!isDirectory(path.getParent())) {
            createDirectory(path.getParent());
        }

        /* Write content to file */
        try {
            /* Default encoding is UTF-8 */
            Files.writeString(path, content);
        } catch (IOException e) {
            System.out.println("Error writing to file " + dstPath + ": " + e.getMessage());
        }
    }

    public static boolean isDirectory(Path path) {
        return Files.exists(path) && Files.isDirectory(path);
    }

    public static void createDirectory(Path path) {
        try {
            Files.createDirectories(path);
        } catch (IOException e) {
            System.out.println("Error creating directory " + path.toAbsolutePath() + ": " + e.getMessage());
        }
    }
}
