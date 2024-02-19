package ru.inno.course.patterns;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EnumsDemo {

    @Test
    public void canCreateMovie() {
        Movie m = new Movie("Елки 27", 2025, GenreEnum.HORROR.COMEDY);
        assertNotNull(m);
    }

    @Test
    public void correctEqualsWork() {
        Movie m1 = new Movie("Елки 26", 2025, GenreEnum.COMEDY.COMEDY);
        Movie m2 = new Movie("Елки 26", 2025, GenreEnum.COMEDY.COMEDY);
        assertEquals(m1, m2);
    }

    @Test
    public void demoStaticFields() {
        assertEquals("Комедия", GenreOldStyle.COMEDY.getName_ru());
    }

    @Test
    public void equalValues() {
        assertEquals(GenreOldStyle.HORROR, GenreOldStyle.HORROR);
        assertSame(GenreOldStyle.HORROR, GenreOldStyle.HORROR);
    }

    @Test
    public void checkSecondField() {
        assertEquals("Comedy", GenreOldStyle.COMEDY.getName_en());
    }

    @Test
    public void checkEnumEquals() {
        assertEquals(GenreEnum.THRILLER, GenreEnum.THRILLER);
        assertSame(GenreEnum.THRILLER, GenreEnum.THRILLER);
    }

    @Test
    public void enumOrdinal() {
        assertEquals(2, GenreEnum.ROMANTIC.ordinal());
    }

    @Test
    public void notForChildrenContent() {
        assertFalse(checkAgeLimit(GenreEnum.THRILLER));
        assertFalse(checkAgeLimit(GenreEnum.HORROR));
        assertTrue(checkAgeLimit(GenreEnum.COMEDY));
    }

    @Test
    public void enumName() {
        assertEquals("HORROR", GenreEnum.HORROR.name());
    }

    @Test
    public void correctEqualsWorkWithEnum() {
        Movie m1 = new Movie("Елки 26", 2025, GenreEnum.COMEDY);
        Movie m2 = new Movie("Елки 26", 2025, GenreEnum.COMEDY);
        assertEquals(m1, m2);
    }

    @Test
    public void проверкаКириллицы() {
        int число = 5;
        assertEquals(5, число);
    }

    @Test
    public void getEnumNameRu() {
        assertEquals("Комедия", GenreEnum.COMEDY.getNameRu());
        assertTrue(GenreEnum.COMEDY.getIconUrl().contains("https"));
    }

    @Test
    public void checkUserAge() {
        assertTrue(GenreEnum.ROMANTIC.checkAgeLimit(6));
        assertFalse(GenreEnum.ROMANTIC.checkAgeLimit(5));
    }

    @Test
    public void checkStatusCode() {
        int responseHttpCode = 200; // типа запрос ушенл и вернулся ответ
        assertEquals(HttpCodes.OK.getCode(), responseHttpCode);
    }

    @Test
    public void createEnum() {
        String genre = "COMEDY";
        GenreEnum genreEnum = GenreEnum.valueOf(genre);
        assertSame(GenreEnum.COMEDY, genreEnum);
    }

    @Test
    public void createEnumLowerCase() {
        String genre = "comedy";
        assertThrows(IllegalArgumentException.class, () -> GenreEnum.valueOf(genre));
    }

    @Test
    public void createEnumNoSuchValue() {
        String genre = "DOCUMENTAL";
        assertThrows(IllegalArgumentException.class, () -> GenreEnum.valueOf(genre));
    }

    private boolean checkAgeLimit(GenreEnum genre) {
        return genre.ordinal() < 2;
    }
}

