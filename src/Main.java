import models.Students;
import services.FileService;
import services.StudentService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class Main {
    public static final String URL = "student.txt";

    public static void main(String[] args) throws Exception {
        String[] url = FileService.readFile(URL);

        Students[] convert = StudentService.convert(url);
        LocalDate date = LocalDate.now();
        int year = date.getYear();

        Students max = StudentService.max(convert);
        FileService.writeFile(URL, "max = " + max.getFirstName() + "," + max.getLastName() + "," + (year - max.getYear())+"\n");

        Students[] a = StudentService.sortedByAge(convert);
        FileService.writeFile(URL,"Sort by Age: ");
        for (Students student : a) {
            FileService.writeFile(URL,student.getFirstName() + " " + student.getLastName() + ",");
        }


        StudentService.printAndCreate(convert);
    }
}
