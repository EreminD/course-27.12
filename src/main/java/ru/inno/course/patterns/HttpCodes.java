package ru.inno.course.patterns;

public enum HttpCodes {
    OK(200),
    CREATED(201),
    ACCEPTED(202),
    REDIRECT(300),
    BAD_REQUEST(400),
    NOT_FOUND(404),
    METHOD_NOT_ALLOWED(405),
    INTERNAL_ERROR(500);
    private int code;

    HttpCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
