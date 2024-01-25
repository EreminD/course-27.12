package ru.inno.course.array;

public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10 ; i++) { // i = 0 1
            System.out.println("========");

            for (int j = 0; j < 10; j++) { // j = 0 1 2 3 4 ... 9

                for (int k = 0; k < 10; k++) {
                    System.out.println("i = " + i + " j = " + j + " k = " + k);
                }

            }
            System.out.println("++++++++");
        }

    }
}
