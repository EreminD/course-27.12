package ru.inno.course.oop.kinopoisk;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Company {

    private final String name;
    private final int year;
    private List<Movie> filmList;

    public Company(String name, int year) {
        this.name = name;
        this.year = year;
        this.filmList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void addMovie(Movie film) {
        this.filmList.add(film);
    }

    public List<Movie> getFilmList() {
        return filmList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company company)) return false;
        return getYear() == company.getYear() && Objects.equals(getName(), company.getName()) && Objects.equals(getFilmList(), company.getFilmList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getYear(), getFilmList());
    }

    @Override
    public String toString() {
        return "Company{" + "name='" + name + '\'' + ", year=" + year + ", filmList=" + filmList + '}';
    }
}
