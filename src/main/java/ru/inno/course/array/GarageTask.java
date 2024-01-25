package ru.inno.course.array;

public class GarageTask {

    public static void main(String[] args) {

        Car polo = new Car("red", "vw", "polo", 120);
//        Car camry = new Car("black", "toyota", "camry", 40000);
//        Car rio = new Car("white", "kia", "rio", 12);
//        Car solaris = new Car("yellow", "hundai","solaris", 12);
//        Car moskvich = new Car("blue", "moskvich", "3", 100);

//        Car[] garage = new Car[5];
//        garage[0] = polo;
//        garage[1] = rio;
//        garage[2] = moskvich;
//        garage[3] = solaris;
//        garage[4] = camry;

//        Car[] garage = {polo, camry, rio, solaris, moskvich};

        Car[] garage = {
                new Car("red", "vw", "polo", 120),
                new Car("black", "toyota", "camry", 40000),
                new Car("white", "kia", "rio", 12),
                new Car("yellow", "hundai","solaris", 12),
                new Car("blue", "moskvich", "3", 100),
                new Car("grey", "moskvich", "3", 100)
        };

//        System.out.println(garage[3].brand.toUpperCase());

      // вывести цвет марку и модель каждой машины
        // решение "в лоб"
//        Car currentCar = garage[0];
//        System.out.println(currentCar.color + " " + currentCar.brand+"-"+currentCar.model);
//
//        currentCar = garage[1];
//        System.out.println(currentCar.color + " " + currentCar.brand+"-"+currentCar.model);
//
//        currentCar = garage[2];
//        System.out.println(currentCar.color + " " + currentCar.brand+"-"+currentCar.model);
//
//        currentCar = garage[3];
//        System.out.println(currentCar.color + " " + currentCar.brand+"-"+currentCar.model);
//
//        currentCar = garage[4];
//        System.out.println(currentCar.color + " " + currentCar.brand+"-"+currentCar.model);

        //для кажлой машины из списка нужно сделать:
        //- 1
        // -2

        // loop
        // for-each loop

        System.out.println("Старт");

//        for (Car currentCar : garage) {
//            System.out.println("Начали обработку");
//            System.out.println(currentCar.color + " " + currentCar.brand+"-"+ currentCar.model);
//            System.out.println("Закончили обработку");
//        }
//
//        System.out.println("Финиш");
//
//
//
//        int[] numbers = {10,20,30,40,50};
//
//        for (int number : numbers) {
//            System.out.println(number + " -> " + number*2);
//        }



//        [ от -> до ]
//        for (int counter = 100; counter > 0; counter=counter+1) {
//            System.out.println("привет " + counter);
//        }

        System.out.println("Финиш");


//        for (Car currentCar : garage) {
//            System.out.println(currentCar.color + " " + currentCar.brand+"-"+ currentCar.model);
//        }

        for (var i = 0; i < garage.length; i++) {
            Car currentCar = garage[i];
            currentCar.passengers[0] = "Mike";
            System.out.println(currentCar.color + " " + currentCar.brand+"-"+ currentCar.model);
        }


        int x = 10;

        // x++
        // 1. возьми текущее значение и отдай
        // 2. увеличь значение на 1
        int y = x++; // y = 10; x = 11
        int z = x++; // z = 11; x = 12

        System.out.println(y);
        System.out.println(z);
        System.out.println(x);


    }
}
