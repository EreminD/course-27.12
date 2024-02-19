package ru.inno.course.patterns;

import java.util.Objects;

public class Movie {

    private String title;
    private double rating;
    private GenreEnum genre;

    public Movie(String title, double rating, GenreEnum genre) {
        this.title = title;
        this.rating = rating;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    public GenreEnum getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return Double.compare(movie.getRating(), getRating()) == 0 && Objects.equals(getTitle(), movie.getTitle()) && Objects.equals(getGenre(), movie.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getRating(), getGenre());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                ", genre='" + genre + '\'' +
                '}';
    }
}
