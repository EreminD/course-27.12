package ru.inno.course.basics.fs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.xml.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@JsonPropertyOrder({"author", "price"})
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Book {

    @JsonProperty("title")
    private String title;

    @XmlAttribute
    private String ISBN;

    @XmlElementWrapper(name = "authors")
    @JsonProperty("authors")
    private List<Author> author;
    private int price;
    private int rating;

    public Book() {
    }

    public Book(String title, String ISBN, int price) {
        this.title = title;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return getPrice() == book.getPrice() && getRating() == book.getRating() && Objects.equals(getTitle(), book.getTitle()) && Objects.equals(getISBN(), book.getISBN()) && Objects.equals(getAuthor(), book.getAuthor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getISBN(), getAuthor(), getPrice(), getRating());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
