package ru.inno.course.array;

import ru.inno.course.oop.User;

public class Array101 {

    public static void main(String[] args) {

        int x = 10;
        long y = 20;

        // 1. Массивы типизированы. Мы сразу говорим, какого типа данных содержимое
        // 2. Сразу обозначаем размер массива
        int[] numbers1 = new int[6];

        int[] numbers2 = new int[] {10,20,30,40,50,60}; // сразу кладут значения в ячейки
                        // 0  1  2
        int[] numbers3 = {10,20,30,40,50,60}; // сразу кладут значения в ячейки

        // 3. Индексация начинается с 0
        int a = 10;
        int b = a;
        a = 12;

        System.out.println(numbers3[0]); //10
        System.out.println(numbers3[4]); //50

        // Индекс последнего элемента равен {длина-1}
//        System.out.println(numbers3[6]); // ArrayIndexOutOfBoundsException 0,1,2,3,4,5


        int shouldBe20 = numbers3[1]; // чтение из массива
        System.out.println(shouldBe20);

        numbers3[1] = 25; // запись значения в элемент массива
        int shouldBe25 = numbers3[1];
        System.out.println(shouldBe25);

        numbers3 = new int[] {100,200,300,400,500,600};
        System.out.println(numbers3[5]);

        numbers3 = new int[] {1000,2000,3000,4000, 5000, 6000, 7000};
        System.out.println(numbers3[3]);

        long[] longs = new long[1_000_000_000];
        longs[1234567] = 500;

        boolean[] bools = {true, false, true, true, false};

        short[] shorts = new short[60*60*24];

        String[] names = new String[3];
        names[0] = "Василий";
        names[1] = "Сергей";
        names[2] = "Никита";

        User[] myUsers = new User[5];

        int namesLength = names.length;
        System.out.println(namesLength);

        System.out.println(myUsers.length);

        char[] chars = new char[0];
        System.out.println(chars.length);
        System.out.println(chars[0]);

        // 0 != null

        String[][] letters = new String[2][13];
//        String[] row1 = letters[0];
        letters[0][1] = "b";
        letters[1][11] = "y";

        int[][] matrix = new int[3][4];

        int[][] gameOfThrones  =  {
                {1,2,3,4,5,6,7,8,9,10},
                {11,12,13,14,15,16},
                {17,18,19,20,21,22,23,24,25},
                {26,27,28}
        };

    }
}
