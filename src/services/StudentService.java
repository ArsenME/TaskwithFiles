package services;

import models.Students;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StudentService {
    public static Students[] convert(String[] lines) {
        Students[] students = new Students[lines.length];

        for (int i = 0; i < lines.length; i++) {

            Students student = new Students(lines[i]);
             students[i] = student;
        }
        return students;
    }

    public static Students max(Students[] students) {
        Students max  = students[0];
        for (int i = 1; i < students.length; i++) {
            if(students[i].getYear() < max.getYear()){
                max = students[i];

            }
        }
        return max;

    }
    public static Students[] sortedByAge(Students[] students){



        for(int i = 0; i < students.length; i++){
            for(int j = 0; j < students.length; j++){
                if(students[i].getYear() > students[j].getYear()){
                    Students  tempStudent = students[i];
                    students[i] = students[j];
                    students[j] = tempStudent;

                }
            }

        }


        return students;
    }

    public static void printAndCreate(Students[] students) throws Exception {


        for(int i = 0; i < students.length; i++){

                FileService.writeOtherFile(students[i].getLastName(),students[i].getFirstName()+ "," + students[i].getLastName());



        }

    }


}
