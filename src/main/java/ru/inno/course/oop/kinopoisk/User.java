package ru.inno.course.oop.kinopoisk;

public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public void rateFilm(Movie movie, double rating){
        System.out.println("Пользователь " + this.name + " оценивает фильм " + movie.getTitle() + " "+rating);
        movie.rate(rating);
    }

}
