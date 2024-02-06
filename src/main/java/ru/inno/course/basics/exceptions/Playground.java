package ru.inno.course.basics.exceptions;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.SQLException;
import java.util.List;

public class Playground {

    public static void main(String[] args) {


        List<String> content = null;

        // красную спортивную машину
        try {
            int c = 10/0;
            content = Files.readAllLines(Path.of("./src/main/java/ru/inno/course/oop/Employee.jav1a"));

        } catch (IOException e) { // красная + спортивная + машина
            System.out.println("Проблема с файлом");
        } catch (IllegalArgumentException ex) { // красная + машина
            System.out.println("проблема в коде");
        } catch (Exception ex){ // машина
            System.out.println("Все плохо");
        } finally {
            System.out.println("Конец работы программы");
        }

//        Exception
//        IOException
//        NoSuchFileException

        for (String c : content) {
            System.out.println(c);
        }

//

//
//
//        try {
//            // send request --> no connection; timeout connection; dns no resolved; 401; 400; 404; 500
//        } catch (Exception ex) {
//            System.out.println("Попробуйте позже");
//        }


    }
}
