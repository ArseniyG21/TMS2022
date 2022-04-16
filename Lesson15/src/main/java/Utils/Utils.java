package Utils;

import java.io.File;

public class Utils {

    public static void readFiles(File directory) {
        if (directory.isDirectory() && directory.exists()) {
            for (File file : directory.listFiles()) {
                if (file.isFile()) {
                    System.out.println(file.getName() + " файл");
                } else {
                    System.out.println(file.getName() + " каталог");
                    readFiles(file);
                }
            }
        }
    }
}
