package services;

import java.io.IOException;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileService {
    public static String [] readFile(String url) throws Exception {

        return Files.readAllLines(Path.of(url)).toArray(new String[0]);
    }

    public static void  writeFile(String url, String content) throws Exception {
        Files.write(Paths.get(url), content.getBytes() , StandardOpenOption.APPEND);
    }
    public static void writeOtherFile(String url, String content) throws Exception {

        Files.write(Files.createFile(Paths.get(url)), content.getBytes(), StandardOpenOption.APPEND);


    }
}
