package ru.inno.course.patterns;

public enum GenreEnum {
    COMEDY("Комедия", "Comedy", "https://icons.com/comedy", 0),
    ROMANTIC("Мелодрама", "Romantic", "https://icons.com/romantic", 6),
    HORROR("Ужасы", "Horror", "https://icons.com/horror", 12),
    THRILLER("Триллер", "Thriller", "https://icons.com/thrill", 12);

    private String nameRu;
    private String nameEn;
    private String iconUrl;
    private int ageLimit;

    GenreEnum(String nameRu, String nameEn, String iconUrl, int ageLimit) {
        this.nameRu = nameRu;
        this.nameEn = nameEn;
        this.iconUrl = iconUrl;
        this.ageLimit = ageLimit;
    }

    public String getNameRu() {
        return nameRu;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public boolean checkAgeLimit(int userAge){
        return userAge >= this.ageLimit;
    }
}
