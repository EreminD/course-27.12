package ru.inno.course.oop.kinopoisk;

public class Playground {

    public static void main(String[] args) {

        Movie myMovie = new Movie("Toy story");
        Movie anotherOne = null;

        User elena = new User("Елена");
        User sergey = new User("Сергей");

        elena.rateFilm(myMovie, 7.2);
        sergey.rateFilm(myMovie, 8);
        elena.rateFilm(anotherOne, 10);

        System.out.println("Votes = " + myMovie.getVotes());
        System.out.println("Rating = " + myMovie.getRating());

        System.out.println(anotherOne.getRating());
    }
}
