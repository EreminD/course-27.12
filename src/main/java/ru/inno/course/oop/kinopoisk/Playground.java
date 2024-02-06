package ru.inno.course.oop.kinopoisk;

import java.util.ArrayList;
import java.util.List;

public class Playground {

    public static void main(String[] args) {

//        Movie myMovie = new Movie("Toy story");
//        Movie anotherOne = null;
//
//        User elena = new User("Елена");
//        User sergey = new User("Сергей");
//
//        elena.rateFilm(myMovie, 7.2);
//        sergey.rateFilm(myMovie, 8);
//        elena.rateFilm(anotherOne, 10);
//
//        System.out.println("Votes = " + myMovie.getVotes());
//        System.out.println("Rating = " + myMovie.getRating());
//
//        System.out.println(anotherOne.getRating());


        String filmFormat = Movie.FILE_FORMAT;

        Movie.createFilm("Крестный отец", 9.5);


        Company mgm = new Company("MGM", 1937);
        mgm.getFilmList().add(new Movie("Дом у дороги 1"));
        mgm.getFilmList().add(new Movie("Дом у дороги 2"));
        mgm.getFilmList().add(new Movie("Дом у дороги 3"));



        Company miramax = new Company("Miramax", 1937);
        miramax.getFilmList().add(new Movie("Мортал комбат 1"));
        miramax.getFilmList().add(new Movie("Мортал комбат 2"));
        miramax.getFilmList().add(new Movie("Мортал комбат 3"));

        Company mosfilm = new Company( "Мосфильм", 1954);
        mosfilm.addMovie(new Movie("Ирония судьбы 2"));
        mosfilm.addMovie(new Movie("Ирония судьбы 1"));
        mosfilm.addMovie(new Movie("Ирония судьбы 3"));

        List<Company> companyList = new ArrayList<>();
        companyList.add(miramax);
        companyList.add(mgm);
        companyList.add(mosfilm);

        System.out.println(mosfilm);

        System.out.println(mosfilm);





    }
}
