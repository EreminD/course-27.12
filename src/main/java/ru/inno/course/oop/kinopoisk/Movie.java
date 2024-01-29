package ru.inno.course.oop.kinopoisk;

public class Movie {

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
}
