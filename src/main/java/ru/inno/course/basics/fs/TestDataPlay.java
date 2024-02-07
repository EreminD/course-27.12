package ru.inno.course.basics.fs;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TestDataPlay {

    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        TestData data = mapper.readValue("src/main/resources/testdata.json", TestData.class);
        data.getUserLogin();
        data.getUserPass();
    }
}
