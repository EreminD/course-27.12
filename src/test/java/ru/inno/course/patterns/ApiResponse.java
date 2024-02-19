package ru.inno.course.patterns;

import java.util.Map;

public class ApiResponse<T> {
    public int statusCode;
    public Map<String, String> headers;
    public T body;
}
