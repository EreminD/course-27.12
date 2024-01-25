package ru.inno.course.oop;

public class Post {

    String title;
    private int likes;

    public Post(String title) {
        this.title = title;
        this.likes = 0;
    }

    public void like(){
        this.likes++;
    }

    public void share(){
        like();
        System.out.println("Вашим постом поделились");
    }

    public void dislike(){
        this.likes--;
    }

    public int getLikes(){
        return this.likes;
    }
}
