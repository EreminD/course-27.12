package ru.inno.course.oop.kinopoisk;

import java.util.Objects;

public class Movie {

    static String FILE_FORMAT = "MP4";
    private String title;
    private double rating; // 0
    private int votes; // 0

    public Movie(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public int getVotes() {
        return votes;
    }

    public void rate(double userRating){
        // if userRating > 10
        // if userRating < 0
        double newRating = this.rating + userRating;
        int newVotes = this.votes + 1;

        this.votes = newVotes;
        this.rating = newRating / newVotes;
    }


    public static Movie createFilm(String title, double rating){
        Movie movie = new Movie(title);
        movie.rate(rating);
        return movie;
    };

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Double.compare(movie.getRating(), getRating()) == 0 && getVotes() == movie.getVotes() && Objects.equals(getTitle(), movie.getTitle());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getRating(), getVotes());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", votes=" + votes +
                '}';
    }
}
