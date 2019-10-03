package dev.ceos.springrestframework.controller;

import org.springframework.http.ResponseEntity;

public class ResponseExample {

    private String message;
    private String name;
    private String school;

    public ResponseExample(String text, Integer likesCount) {
        this.message = text;
        this.name = String.valueOf(likesCount);
        this.school = "학교";
    }
}


