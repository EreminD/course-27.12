package ru.inno.course.patterns;

import java.util.Objects;

public class GenreOldStyle {
    public static GenreOldStyle COMEDY = new GenreOldStyle("Комедия", "Comedy");
    public static GenreOldStyle DETECTIVE = new GenreOldStyle("Детектив", "Detective");
    public static GenreOldStyle HORROR = new GenreOldStyle("Ужасы", "Horror");
    public static GenreOldStyle ROMANTIC = new GenreOldStyle("Мелодрама", "Romantic");
    private String name_ru;
    private String name_en;

    private GenreOldStyle(String nameRu, String nameEn) {
        this.name_ru = nameRu;
        this.name_en = nameEn;
    }

    public String getName_ru() {
        return name_ru;
    }

    public String getName_en() {
        return name_en;
    }

    @Override
    public String toString() {
        return "Genre{" +
                "name_ru='" + name_ru + '\'' +
                ", name_en='" + name_en + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GenreOldStyle genre)) return false;
        return Objects.equals(getName_ru(), genre.getName_ru()) && Objects.equals(getName_en(), genre.getName_en());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName_ru(), getName_en());
    }
}
