package ru.inno.course.oop;

public class SocialMedia {

    public static void main(String[] args) {

        Post post1 = new Post("Как писать на java, чтобы нравилось, пожалуйста");
        Post post2 = new Post("Почему вам стоило выбрать Python");

        // click
        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();
        post1.like();

        post1.dislike();


        post1.share();
        int l = post1.getLikes();
        System.out.println(l);

    }
}
