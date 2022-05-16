import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static String text1 = "Каталог создан";
    public static String text2 = "Файл создан";
    public static StringBuilder log = new StringBuilder();

    public static void main(String[] args) {
        File dir1 = new File("C://Users//stix_//Desktop//Games//src");
        createDir(dir1);

        File dir1_1 = new File("C://Users//stix_//Desktop//Games//src//main");
        createDir(dir1_1);

        File file1_1_1 = new File("C://Users//stix_//Desktop//Games//src//main//Main.java");
        createFile(file1_1_1);

        File file1_1_2 = new File("C://Users//stix_//Desktop//Games//src//main//Utils.java");
        createFile(file1_1_2);

        File dir1_2 = new File("C://Users//stix_//Desktop//Games//src//test");
        createDir(dir1_2);

        File dir2 = new File("C://Users//stix_//Desktop//Games//res");
        createDir(dir2);

        File dir2_1 = new File("C://Users//stix_//Desktop//Games//res//drawables");
        createDir(dir2_1);

        File dir2_2 = new File("C://Users//stix_//Desktop//Games//res//vectors");
        createDir(dir2_2);

        File dir2_3 = new File("C://Users//stix_//Desktop//Games//res//icons");
        createDir(dir2_3);

        File dir3 = new File("C://Users//stix_//Desktop//Games//savegames");
        createDir(dir3);

        File dir4 = new File("C://Users//stix_//Desktop//Games//temp");
        createDir(dir4);

        File file4_1 = new File("C://Users//stix_//Desktop//Games//temp//temp.txt");
        createFile(file4_1);

        try (FileWriter writer = new FileWriter("C://Users//stix_//Desktop//Games//temp//temp.txt", false)) {
            writer.write(log.toString());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void createDir(File dir) {
        if (dir.mkdir()) {
            log.append(text1).append(": ").append(dir.getName()).append("\n");
        }
    }

    public static void createFile(File file) {
        try {
            if (file.createNewFile())
                log.append(text2).append(": ").append(file.getName()).append("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
