
package dev.ceos.springrestframework.controller;

import org.springframework.http.ResponseEntity;

public class ResponseExample {

    private String text;
    private String likeCount;

    public ResponseExample(String text, Integer likesCount) {
        this.text = text;
        this.likeCount = String.valueOf(likesCount);
    }
}