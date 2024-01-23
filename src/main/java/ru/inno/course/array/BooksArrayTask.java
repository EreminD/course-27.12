package ru.inno.course.array;

public class BooksArrayTask {

    public static void main(String[] args) {
        String[] books = new String[3];
        books[0] = "java для профессионалов";
        books[1] = "Три мушкетера";
        books[2] = "12 стульев";

        System.out.println(books[1].toUpperCase());

        int[] nums = {1,2,3};

        System.out.println(nums[2] + nums[0]);
    }
}
